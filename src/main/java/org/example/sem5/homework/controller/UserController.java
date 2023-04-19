package org.example.sem5.homework.controller;

import org.example.sem5.homework.model.User;
import org.example.sem5.homework.service.UserService;

public class UserController {
    private UserService userService = new UserService();

    public void addUser(User user){
        userService.addUser(user);
    }
    public void deleteUser(User user){
        userService.deleteUser(user);
    }
    public User getUser(User user){
        return userService.getUser(user);
    }


}
