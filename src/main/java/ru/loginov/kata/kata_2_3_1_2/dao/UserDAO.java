package ru.loginov.kata.kata_2_3_1_2.dao;

import ru.loginov.kata.kata_2_3_1_2.entity.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();

    void saveUsers(User user);

    User getUser(int id);

    void updateUser(User user);

    void deleteUser(int id);
}
