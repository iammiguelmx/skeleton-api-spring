package com.mx.skeleton.persistence.crud;

import com.mx.skeleton.persistence.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRolRepository extends JpaRepository<Role, Long> {

}
