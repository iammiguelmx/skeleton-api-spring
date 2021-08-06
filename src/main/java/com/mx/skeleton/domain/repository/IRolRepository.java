package com.mx.skeleton.domain.repository;

import com.mx.skeleton.persistence.entity.Role;

public interface IRolRepository {

    Role findByRole(String role);
}
