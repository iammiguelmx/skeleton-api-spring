package com.mx.skeleton.service.impl;

import com.mx.skeleton.dao.IUserDAO;
import com.mx.skeleton.model.User;
import com.mx.skeleton.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @ProjectName: skeleton-java
 * @Package: com.mx.skeleton.service
 * @ClassName:
 * @Author:
 * @Description:
 * @Date:
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDAO userDAO;

    @Override
    public void save(User user) {
        userDAO.save(user);
    }

    @Override
    public List<User> getAll() {
        return userDAO.getAll();
    }
}
