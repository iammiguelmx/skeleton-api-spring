package com.mx.skeleton.dao;

import com.mx.skeleton.model.User;

import java.util.List;

public interface IUserDAO {

    void save(User user);

    List<User> getAll();

}
