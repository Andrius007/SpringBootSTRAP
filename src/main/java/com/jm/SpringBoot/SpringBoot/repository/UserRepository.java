package com.jm.SpringBoot.SpringBoot.repository;

import com.jm.SpringBoot.SpringBoot.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findUserByUsername(String username);
}
