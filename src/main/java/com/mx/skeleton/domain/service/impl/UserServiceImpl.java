package com.mx.skeleton.domain.service.impl;

import com.mx.skeleton.domain.repository.impl.RolRepositoryImpl;
import com.mx.skeleton.persistence.entity.User;
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
    private RolRepositoryImpl rolDAO;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private IUserService iUserService;

    @Override
    public void save(User user) {
        iUserService.save(user);
    }

    @Override
    public List<User> getAll() {
        return iUserService.getAll();
    }

    @Override
    public User findUserByUserName(String username) {
        return iUserService.findUserByUserName(username);
    }

    @Override
    public void updatePassword(String password, Long userId) {
        iUserService.updatePassword(password,userId);
    }
}
