package org.example.sem4.controller;

import java.time.LocalDate;

public interface UserController {
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}
