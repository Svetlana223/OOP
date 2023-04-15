package org.example.sem5.sem5.repo;

import org.example.sem5.sem5.model.User;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserRepo {
    private List<User> db = new ArrayList<>();

    public void addUser(User user) {
        db.add(user);
    }
    public void deleteUser(User user){
        db.remove(user);
    }

    public User getUser(User user){
        for (User el: db) {
            if(el.getUserID().equals(user.getUserID())){
                return el;
            }
        }
        return null;
    }

    public void saveUser(User user){
        try(FileWriter fileWriter = new FileWriter("text.txt", true)){
            fileWriter.write(user.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
