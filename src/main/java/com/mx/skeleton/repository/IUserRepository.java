package com.mx.skeleton.repository;

import com.mx.skeleton.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @ProjectName: skeleton-java
 * @Package: com.mx.skeleton
 * @ClassName: App
 * @Author: Miguel Camacho
 * @Description: App initial run
 * @Date: 2020-14-07
 */
public interface IUserRepository extends CrudRepository<User, Long> {
}
