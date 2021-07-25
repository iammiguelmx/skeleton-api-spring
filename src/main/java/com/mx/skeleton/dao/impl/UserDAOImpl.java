package com.mx.skeleton.dao.impl;

import com.mx.skeleton.dao.IUserDAO;
import com.mx.skeleton.domain.User;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;


@Repository
@Transactional
public class UserDAOImpl implements IUserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    private Session session;

    @Override
    public void save(User user) {
        entityManager.persist(user);
    }

    @Override
    public List<User> getAll() {
        return session.createQuery("SELECT u.user_id,u.create_date,u.last_name,u.name FROM User u",User.class).getResultList();
    }


}
