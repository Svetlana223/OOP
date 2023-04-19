package org.example.sem5.homework.controller;

import org.example.sem5.homework.model.User;
import org.example.sem5.homework.service.BalanceService;
import org.example.sem5.homework.service.UserService;

public class BalanceController {
        private UserService userService = new UserService();
        private BalanceService balanceService = new BalanceService();
        public void addBalance(User user, double amount){
                balanceService.addBalance(user, amount);
        }
        public void subBalance(User user, double amount){
                balanceService.subBalance(user, amount);
        }
        public double getBalance(User user){
                return balanceService.getBalance(user);
        }
}
