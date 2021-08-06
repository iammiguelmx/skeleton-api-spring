package com.mx.skeleton.domain.service.impl;

import com.mx.skeleton.persistence.entity.Role;
import com.mx.skeleton.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService implements IRoleService {

    @Autowired
    private IRoleService iRoleService;

    @Override
    public Role findByRole(String role) {
        return iRoleService.findByRole(role);
    }
}
