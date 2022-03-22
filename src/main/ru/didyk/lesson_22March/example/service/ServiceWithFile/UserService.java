package ru.didyk.lesson_22March.example.service.ServiceWithFile;

import ru.didyk.example.model.User;

import java.util.List;

public interface UserService {

    User addUser(User user);
    User getByAccount(String account);
    List<User> getAllUsers();
    User updateUser(User user);
    void deleteUser(String account);
}
