package org.example.sem6.homework.view;


import org.example.sem6.homework.data.User;

import java.util.List;

public interface UserView <T extends User>{
    void sendOnConsole(List<T> list);
}
