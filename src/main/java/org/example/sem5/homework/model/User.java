package org.example.sem5.homework.model;

public class User {
    private String name;
    private String lastName;
    private Integer age;
    private Double balance;

    public User(String name, String lastName, Integer age, Double balance) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.balance = balance;
    }

    public User(String name, String lastName, Integer age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.balance = 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
    public void addBalance(Double amount){ this.balance += amount;}
    public void subBalace(Double amount){ this.balance -= amount;}
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", balance=" + balance +
                '}';
    }
}
