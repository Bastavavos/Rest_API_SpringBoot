package com.webapp.user.controller;

import com.webapp.user.model.User;
import com.webapp.user.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private final UserService UserService;

    public UserController(UserService UserService) {
        this.UserService = UserService;
    }

    @GetMapping("users")
    public List<User> getAllUsers() {
        return UserService.getAll();
    }

    @GetMapping("users/{id}")
    public User getById(@PathVariable int id) {
        return UserService.getById(id);
    }

    @PostMapping("users")
    public User createUser(@RequestBody User User) {
        return UserService.createUser(User);
    }

    @PutMapping("users/{id}")
    public User updateUser(@PathVariable int id, @RequestBody User User) {
        User.setId(id);
        return UserService.updateUser(User);
    }

    @DeleteMapping("users/{id}")
    public void deleteById(@PathVariable int id) {
        UserService.deleteUser(UserService.getById(id));
    }

    @DeleteMapping("users")
    public void deleteAll() {
        UserService.deleteAll();
    }
}
