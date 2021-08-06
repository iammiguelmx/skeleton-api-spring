package com.mx.skeleton.domain.repository.impl;

import com.mx.skeleton.persistence.entity.BitacorraError;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;


@Repository
@Transactional
public class BitacoraRepositoryimpl implements com.mx.skeleton.service.IBitacoraErrorService {

    @PersistenceContext
    private EntityManager entityManager;

    private Session session;

    @Override
    public void save(BitacorraError error) {
        entityManager.persist(error);
    }
}
