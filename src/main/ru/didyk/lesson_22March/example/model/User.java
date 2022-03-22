package ru.didyk.lesson_22March.example.model;

public class User {

    private String account;
    private String name;
    private String surname;

    public User() {
    }

    public User(String account, String name, String surname) {
        this.account = account;
        this.name = name;
        this.surname = surname;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
