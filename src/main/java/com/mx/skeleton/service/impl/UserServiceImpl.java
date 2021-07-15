package com.mx.skeleton.service.impl;

import com.mx.skeleton.domain.User;
import com.mx.skeleton.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserService userService;

    @Override
    public User save(User user) {
        return  userService.save(user);
    }
}
