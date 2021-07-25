package com.mx.skeleton.dao;

import com.mx.skeleton.domain.User;

import java.util.List;

public interface IUserDAO {

    void save(User user);

    List<User> getAll();

}
