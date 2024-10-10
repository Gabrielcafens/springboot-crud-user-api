package com.example.demo.controller;

import com.example.demo.record.UserRecord;
import com.example.demo.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<UserRecord>create(@RequestBody UserRecord userRecord){
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.createUser(userRecord));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserRecord>getById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.FOUND).body(userService.getUserById(id));
    }

    @GetMapping
    public ResponseEntity<UserRecord>getByCpf(@RequestParam("cpf") String cpf){
        return ResponseEntity.status(HttpStatus.FOUND).body(userService.getUserByCpf(cpf));
    }

    @GetMapping("/list")
    public  ResponseEntity<List<UserRecord>>listAll() {
        return  ResponseEntity.status(HttpStatus.FOUND).body(userService.listAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserRecord>update(@PathVariable Long id, @RequestBody UserRecord userRecord){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(userService.updateUser(id , userRecord));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String>delete(@PathVariable Long id){
        userService.deleteById(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("User Deleted");
    }

}
