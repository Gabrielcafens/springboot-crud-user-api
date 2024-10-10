package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository <User, Long> {
    //@Query("select * from Users Where Cpf =:cpf") caso queira uma busca mais personalizada
    Optional<User> findByCpf(String cpf);

}
