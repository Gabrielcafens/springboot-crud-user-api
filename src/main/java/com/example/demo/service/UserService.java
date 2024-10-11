package com.example.demo.service;

import com.example.demo.record.UserRecord;
import com.example.demo.persistence.User;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class UserService {
    private final UserRepository userRepository;

    private static final String USER_NOT_FOUND ="User Not Found";

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    private UserRecord convertToUserRecord(User user) {
        return new UserRecord(
                user.getName(),
                user.getCpf(),
                user.getAge(),
                user.getAddress(),
                user.getFavoriteColor()
        );
    }

    public UserRecord createUser(UserRecord userRecord) {
        return  convertToUserRecord(userRepository.save(new User(userRecord)));
    }

    public UserRecord getUserById(Long id) {
        User user = userRepository.findByIdAndDeletedFalse(id)
                .orElseThrow(()->new NoSuchElementException(USER_NOT_FOUND));
        return convertToUserRecord(user);
    }

    public UserRecord getUserByCpf(String cpf) {
        User user = userRepository.findByCpfAndDeletedFalse(cpf)
                .orElseThrow(()->new NoSuchElementException(USER_NOT_FOUND));
        return  convertToUserRecord(user);
    }

    public List<UserRecord> listAll() {
        List<UserRecord> recordList = new ArrayList<>();
        List<User> userList = userRepository.listAll();
        for (User user: userList){
           recordList.add(convertToUserRecord(user));
        }
        return recordList;
    }

    public UserRecord updateUser(Long id, UserRecord userRecord) {
        User user = userRepository.findByIdAndDeletedFalse(id)
                .orElseThrow(()->new NoSuchElementException(USER_NOT_FOUND));
        user.setName(userRecord.name());
        user.setCpf(userRecord.cpf());
        user.setAge(userRecord.age());
        user.setAddress(userRecord.address());
        user.setFavoriteColor(userRecord.favoriteColor());
        userRepository.save(user);
        return convertToUserRecord(user);
    }

    public void  deleteById(Long id) {
        User user = userRepository.findByIdAndDeletedFalse(id)
                .orElseThrow(()->new NoSuchElementException(USER_NOT_FOUND));
        user.setDeleted(true);
        userRepository.save(user);
    }

}
