package org.example.sem5.homework.view;

import org.example.sem5.homework.controller.BalanceController;
import org.example.sem5.homework.controller.UserController;
import org.example.sem5.homework.model.User;

import java.util.Scanner;

public class UserView {
    public static void main(String[] args) {
        UserController userController = new UserController();
        BalanceController balanceController = new BalanceController();

        User user = new User("Ivan","Ivanov", 19);
        userController.addUser(user);
        System.out.println(userController.getUser(user));
        User user2 = new User("Petr","Petrov", 30);
        userController.addUser(user2);
        System.out.println(userController.getUser(user2));
        userController.deleteUser(user2);
        System.out.println(userController.getUser(user2));
        balanceController.addBalance(user,20);
        balanceController.subBalance(user,5);
        System.out.println(userController.getUser(user));
        System.out.println(balanceController.getBalance(user));
    }
}
