package com.mx.skeleton.persistence.crud;

import com.mx.skeleton.persistence.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User,Long> {
}
