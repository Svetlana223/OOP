package org.example.sem4.view;


import org.example.sem4.data.User;

import java.util.List;

public interface UserView <T extends User>{
    void sendOnConsole(List<T> list);
}
