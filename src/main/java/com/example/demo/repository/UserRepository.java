package com.example.demo.repository;

import com.example.demo.persistence.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository <User, Long> {

    Optional<User> findByCpfAndDeletedFalse(String cpf) ;

    Optional<User> findByIdAndDeletedFalse(Long id) ;

    @Query("SELECT u FROM User u WHERE u.deleted = false")
    List<User> listAll();

}
