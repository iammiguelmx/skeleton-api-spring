package com.mx.skeleton.dao.impl;

import com.mx.skeleton.dao.IUserDAO;
import com.mx.skeleton.domain.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class UserDAOImpl extends GenericDAOImpl<User, Long> implements IUserDAO {

    protected UserDAOImpl() {
        super(User.class);
    }

    @Override
    public User save(User user) {
         getEntityManager().persist(user);
    }
}
