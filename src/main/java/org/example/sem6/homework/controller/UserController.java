package org.example.sem6.homework.controller;

import java.time.LocalDate;

public interface UserController {
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}
