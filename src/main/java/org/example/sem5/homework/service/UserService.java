package org.example.sem5.homework.service;

import org.example.sem5.homework.model.User;
import org.example.sem5.homework.repo.UserRepo;

public class UserService {
    public UserRepo userRepo = new UserRepo();
    public void addUser(User user){
        userRepo.addUser(user);
    }
    public void deleteUser(User user){
        userRepo.deleteUser(user);
    }
    public User getUser(User user){
        return userRepo.getUser(user);
    }
}
