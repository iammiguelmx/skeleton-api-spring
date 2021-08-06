package com.mx.skeleton.service;

import com.mx.skeleton.persistence.entity.User;

import java.util.List;

/**
 * @ProjectName: skeleton-java
 * @Package: com.mx.skeleton.service
 * @ClassName:
 * @Author:
 * @Description:
 * @Date:
 */
public interface IUserService {

    //Save user
    void save(User user);

    //Update Password
    void updatePassword(String password, Long userId);

    List<User> getAll();

    //Find user by username
    User findUserByUserName(String username);

}
