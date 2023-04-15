package org.example.sem5.sem5.service;

import org.example.sem5.sem5.model.User;
import org.example.sem5.sem5.repo.UserRepo;

public class UserService {
    public UserRepo userRepo = new UserRepo();
    public void saveService(User user){
        userRepo.saveUser(user);

    }
    public void addUser(User user){
        userRepo.addUser(user);
    }
    public User getUser(User user){
        return userRepo.getUser(user);
    }
    public void deleteUser(User user){
        userRepo.deleteUser(user);
    }

}
