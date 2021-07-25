package com.mx.skeleton.service;

import com.mx.skeleton.domain.User;

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

    void save(User user);

    List<User> getAll();

}
