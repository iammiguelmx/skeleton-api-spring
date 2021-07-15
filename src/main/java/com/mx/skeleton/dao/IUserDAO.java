package com.mx.skeleton.dao;

import com.mx.skeleton.domain.User;

public interface IUserDAO extends IGenericDAO<User,Long>{

    User save(User user);

}
