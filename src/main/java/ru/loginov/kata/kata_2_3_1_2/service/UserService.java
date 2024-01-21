package ru.loginov.kata.kata_2_3_1_2.service;

import ru.loginov.kata.kata_2_3_1_2.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void saveUsers(User user);

    User getUser(int ID);

    void updateUser(User user);

    void deleteUser(int ID);
}
