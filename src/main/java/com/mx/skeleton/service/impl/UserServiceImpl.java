package com.mx.skeleton.service.impl;

import com.mx.skeleton.repositoty.IUserDAO;
import com.mx.skeleton.repositoty.impl.RolDAOImpl;
import com.mx.skeleton.model.User;
import com.mx.skeleton.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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
    private RolDAOImpl rolDAO;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

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

    @Override
    public User findUserByUserName(String username) {
        return userDAO.findUserByUserName(username);
    }

    @Override
    public void updatePassword(String password, Long userId) {
        userDAO.updatePassword(password,userId);
    }
}
