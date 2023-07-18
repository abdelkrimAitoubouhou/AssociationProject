package com.manytomany.repository;

import com.manytomany.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long > {
    User findByUserName(String userName);
}
