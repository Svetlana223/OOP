package org.example.sem6.homework.data;

import java.time.LocalDate;
import java.util.Comparator;

public class Teacher extends User {

    /**
     * Убираю id из Teacher
     */
//    private Long teacherId;

    public Teacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth, Long countMaxId) {
        super(firstName, secondName, patronymic, dateOfBirth);
    }

    /**
     * Меняю параметры для получения id
     * @return id
     */
    public Long getTeacherId() {
        return id;
    }

    /**
     * Меняю параметры для получения id
     */
    public void setTeacherId(Long teacherId) {
        this.id = teacherId;
    }

    public static class TeacherComparator implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    }
}