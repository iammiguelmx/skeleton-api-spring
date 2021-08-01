package com.mx.skeleton.repositoty.impl;

import com.mx.skeleton.repositoty.IBitacoraDAO;
import com.mx.skeleton.model.BitacorraError;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;


@Repository
@Transactional
public class BitacoraDAOimpl implements IBitacoraDAO {

    @PersistenceContext
    private EntityManager entityManager;

    private Session session;

    @Override
    public void save(BitacorraError error) {
        entityManager.persist(error);
    }
}
