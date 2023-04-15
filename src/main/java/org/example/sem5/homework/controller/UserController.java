package org.example.sem5.homework.controller;

import org.example.sem5.homework.model.User;
import org.example.sem5.homework.service.UserService;

public class UserController {
    private UserService userService = new UserService();

    public void addUser(String name, String lastName, int age){
        userService.addUser(new User(name, lastName, age));
    }
    public void deleteUser(User user){
        userService.deleteUser(user);
    }
    public User getUser(User user){
        return userService.getUser(user);
    }
}
