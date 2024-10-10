package com.example.demo;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table (name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String uuid;
    private String name;
    private String cpf;
    private Integer age;
    private String address;
    private String favoriteColor;

    public User() {
    }

    public User(UserRecord userRecord){
        this.setUuid(UUID.randomUUID().toString());
        this.setName(userRecord.name());
        this.setCpf(userRecord.cpf());
        this.setAge(userRecord.age());
        this.setAddress(userRecord.address());
        this.setFavoriteColor(userRecord.favoriteColor());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }

}
