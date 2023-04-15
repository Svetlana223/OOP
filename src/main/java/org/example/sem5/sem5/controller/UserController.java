package org.example.sem5.sem5.controller;

import org.example.sem5.sem5.model.User;
import org.example.sem5.sem5.service.UserService;

public class UserController {
    private UserService userService = new UserService();
    public void saveNewUser(Integer id, String name, Integer age){
        userService.saveService(new User(id,name,age));
    }
    public void deleteUser(User user){
        userService.deleteUser(user);
    }
    public User getUser(User user){
        return userService.getUser(user);
    }
    public void addUser(User user){
        userService.addUser(user);
    }
}
