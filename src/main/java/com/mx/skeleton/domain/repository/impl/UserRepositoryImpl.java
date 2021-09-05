package com.mx.skeleton.domain.repository.impl;

import com.mx.skeleton.persistence.crud.IUserRepository;
import com.mx.skeleton.persistence.entity.User;
import com.mx.skeleton.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.List;
import com.mx.skeleton.service.IUserService;


@Repository
@Transactional
public class UserRepositoryImpl implements IUserService {

    @Autowired
    private IUserRepository iUserRepository;

    @Autowired
    private IRoleService roleService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;


    @Override
    public void save(User user) {

    }

    @Override
    public void updatePassword(String password, Long userId) {

    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public User findUserByUserName(String username) {
        return null;
    }
}
