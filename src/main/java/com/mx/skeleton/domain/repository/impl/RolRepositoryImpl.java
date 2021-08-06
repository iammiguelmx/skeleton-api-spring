package com.mx.skeleton.domain.repository.impl;

import com.mx.skeleton.persistence.entity.Role;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import com.mx.skeleton.service.IRoleService;

@Repository
@Transactional
public class RolRepositoryImpl implements IRoleService {

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
