package com.mx.skeleton.domain.repository;

import com.mx.skeleton.persistence.entity.User;

import java.util.List;

public interface IUserRepository {

    //Save user
    void save(User user);

    //Update Password
    void updatePassword(String password, Long userId);

    List<User> getAll();

    //Find user by username
    User findUserByUserName(String username);

}
