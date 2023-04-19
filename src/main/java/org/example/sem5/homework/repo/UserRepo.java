package org.example.sem5.homework.repo;

import org.example.sem5.homework.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepo {
    private List<User> userList = new ArrayList<>();

    public void addUser(User user) {
        userList.add(user);
    }

    public void deleteUser(User user) {
        userList.remove(user);
    }

    public User getUser(User user) {
        for (User el : userList) {
            if (el.getName().equals(user.getName()) && el.getLastName().equals(user.getLastName()) && el.getAge().equals(user.getAge())) {
                return el;
            }
        }
        return null;
    }

    public void addBalance(User user, double amount){
        user.setBalance(amount);
    }
    public void subBalance(User user, double amount){
        user.setBalance(user.getBalance() - amount);
    }

    public double getBalance(User user) {
        return user.getBalance();
    }
}

