package com.mx.skeleton.repository;

import com.mx.skeleton.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepository extends CrudRepository<User, Long> {
}
