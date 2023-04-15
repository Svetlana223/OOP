package org.example.sem5.sem5.view;

import org.example.sem5.sem5.controller.UserController;
import org.example.sem5.sem5.model.User;

import java.util.Scanner;

public class UserView {
    public static void main(String[] args) {
        UserController userController = new UserController();
        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter your data");
//        userController.saveNewUser(scanner.nextInt(), scanner.next(), scanner.nextInt());
        User user = new User(1, "Ivan", 19);

        userController.addUser(user);
        System.out.println(userController.getUser(user));
        userController.getUser(user);
        userController.deleteUser(user);
        System.out.println(userController.getUser(user));
    }
}
