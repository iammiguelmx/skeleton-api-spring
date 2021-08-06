package com.mx.skeleton.domain.service.impl;

import com.mx.skeleton.persistence.entity.BitacorraError;
import com.mx.skeleton.service.IBitacoraErrorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BitacoraServiceImpl implements IBitacoraErrorService {

    @Autowired
    private IBitacoraErrorService iBitacoraErrorService;

    @Override
    public void save(BitacorraError error) {
        iBitacoraErrorService.save(error);
    }
}
