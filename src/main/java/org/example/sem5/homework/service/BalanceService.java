package org.example.sem5.homework.service;

import org.example.sem5.homework.model.User;
import org.example.sem5.homework.repo.UserRepo;

public class BalanceService {
    public UserRepo balanceRepo = new UserRepo();
    public void addBalance(User user, double amount){
        balanceRepo.addBalance(user, amount);
    }
    public void subBalance(User user, double amount){
        balanceRepo.subBalance(user, amount);
    }
    public double getBalance(User user){
        return balanceRepo.getBalance(user);
    }
}
