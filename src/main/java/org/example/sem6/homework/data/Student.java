package org.example.sem6.homework.data;

import java.time.LocalDate;
public class Student extends User implements Comparable<Student>{
    /**
     * Убираю id
     */
//    private Long studentId;

    public Student(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
    }

    /**
     * Меняю получение id
     */
    public Student(String firstName, String secondName, String patronymic, LocalDate dateOfBirth, Long studentId) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.id = studentId;
    }

    /**
     * Меняю получение id
     */
    public Long getStudentId() {
        return id;
    }

    /**
     * Меняю получение id
     */
    public void setStudentId(Long studentId) {
        this.id = studentId;
    }
    /**
     * Меняю получение id
     */

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + id +'\'' +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", patronymic='" + super.getPatronymic() + '\'' +
                ", dateOfBirth=" + super.getDateOfBirth() +
                '}';
    }
    /**
     * Меняю получение id
     */
    @Override
    public int compareTo(Student o) {
        return this.id.compareTo(o.id);
    }
}

