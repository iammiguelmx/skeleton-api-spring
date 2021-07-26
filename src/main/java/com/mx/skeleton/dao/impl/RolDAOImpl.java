package com.mx.skeleton.dao.impl;

import com.mx.skeleton.dao.IRolDAO;
import com.mx.skeleton.model.Role;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class RolDAOImpl implements IRolDAO {

    @PersistenceContext
    private EntityManager entityManager;

    private Session session;

    @Override
    public Role findByRole(String role) {
        Role rol;
        String sql = "SELECT r.id, r.role FROM rol r WHERE r.role=:role";
        return  rol = (Role) session.createSQLQuery(sql).setParameter("role", role).addEntity(Role.class);
    }
}
