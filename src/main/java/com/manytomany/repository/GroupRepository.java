package com.manytomany.repository;

import com.manytomany.entities.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group, Long> {
    Group findByGroupName(String userName);
}
