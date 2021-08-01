package com.mx.skeleton.service.impl;

import com.mx.skeleton.repositoty.IRolDAO;
import com.mx.skeleton.model.Role;
import com.mx.skeleton.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService implements IRoleService {

    @Autowired
    private IRolDAO iRolDAO;

    @Override
    public Role findByRole(String role) {
        return iRolDAO.findByRole(role);
    }
}
