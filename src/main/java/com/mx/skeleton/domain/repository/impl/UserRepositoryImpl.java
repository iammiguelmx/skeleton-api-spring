package com.mx.skeleton.domain.repository.impl;

import com.mx.skeleton.persistence.entity.Role;
import com.mx.skeleton.persistence.entity.User;
import com.mx.skeleton.service.IRoleService;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import com.mx.skeleton.service.IUserService;


@Repository
@Transactional
public class UserRepositoryImpl implements IUserService {

    @Autowired
    private IRoleService roleService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @PersistenceContext
    private EntityManager entityManager;

    private Session session;

    //Default user inactive, confirm token register
    @Override
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setActive(false);
        Role userRole = roleService.findByRole("ADMIN");
        user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
        entityManager.persist(user);
    }

    //TODO: make
    @Override
    public void updatePassword(String password, Long userId) {

    }

    @Override
    public List<User> getAll() {
        return session.createQuery("SELECT u.user_id,u.create_date,u.last_name,u.name FROM User u",User.class).getResultList();
    }

    @Override
    public User findUserByUserName(String username) {
        return null;
    }


}