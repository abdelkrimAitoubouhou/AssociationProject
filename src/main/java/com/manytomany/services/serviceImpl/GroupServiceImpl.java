package com.manytomany.services.serviceImpl;

import com.manytomany.entities.Group;
import com.manytomany.repository.GroupRepository;
import com.manytomany.services.GroupService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class GroupServiceImpl implements GroupService {

    @Autowired
     GroupRepository groupRepository;
    @Override
    public Group saveGroup(Group group) {
        return groupRepository.save(group);
    }
}
