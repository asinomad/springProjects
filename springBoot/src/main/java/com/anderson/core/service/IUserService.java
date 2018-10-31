package com.anderson.core.service;

import java.util.List;
import com.anderson.api.api.pojo.User;

public interface IUserService {

    User findById(Long id);

    List<User> findByName(String name);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUserById(Long id);

    void deleteAllUsers();

    List<User> findAllUsers();
}
