package com.mx.skeleton.dao.impl;

import com.mx.skeleton.dao.IBitacoraDAO;
import com.mx.skeleton.domain.BitacorraError;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;


@Repository
@Transactional
public class BitacoraDAO implements IBitacoraDAO {

    @PersistenceContext
    private EntityManager entityManager;

    private Session session;

    @Override
    public void save(BitacorraError error) {
        entityManager.persist(error);
    }
}