package com.mx.skeleton.repositoty.impl;

import com.mx.skeleton.repositoty.IRolDAO;
import com.mx.skeleton.model.Role;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class RolDAOImpl implements IRolDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Role findByRole(String role) {
        Role rol;
        String sql = "SELECT r.role_id, r.role FROM role r WHERE r.role=:role";
        return  rol = (Role) entityManager.createQuery(sql).
                setParameter("role", role);
    }
}
