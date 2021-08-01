package com.mx.skeleton.repositoty;

import com.mx.skeleton.model.User;

import java.util.List;

public interface IUserDAO {

    //Save user
    void save(User user);

    //Update Password
    void updatePassword(String password, Long userId);

    List<User> getAll();

    //Find user by username
    User findUserByUserName(String username);

}
