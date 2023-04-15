package org.example.sem4.service;


import org.example.sem4.data.Teacher;

import java.time.LocalDate;
import java.util.List;

public class TeacherService implements UserService<Teacher> {
    private final List<Teacher> teachers;

    public TeacherService(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        Long countMaxId = 0L;
        for (Teacher teacher: teachers){
            if (teacher.getTeacherId() > countMaxId){
                countMaxId = teacher.getTeacherId();
            }
        }
        countMaxId++;
        Teacher teacher = new Teacher(firstName, secondName, patronymic, dateOfBirth, countMaxId);
        teachers.add(teacher);
    }
}
