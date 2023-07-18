package com.manytomany.services;

import com.manytomany.entities.Group;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public interface GroupService {

    public Group saveGroup(Group group);
}
