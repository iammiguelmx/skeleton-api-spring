package com.mx.skeleton.service.impl;

import com.mx.skeleton.dao.IBitacoraDAO;
import com.mx.skeleton.domain.BitacorraError;
import com.mx.skeleton.service.IBitacoraErrorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BitacoraServiceImpl implements IBitacoraErrorService {

    @Autowired
    private IBitacoraDAO iBitacoraDAO;

    @Override
    public void save(BitacorraError error) {
      iBitacoraDAO.save(error);
    }
}