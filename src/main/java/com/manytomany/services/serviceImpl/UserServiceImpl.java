package com.manytomany.services.serviceImpl;

import com.manytomany.entities.Group;
import com.manytomany.entities.User;
import com.manytomany.repository.GroupRepository;
import com.manytomany.repository.UserRepository;
import com.manytomany.services.UserService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
     UserRepository userRepository;
    @Autowired
     GroupRepository groupRepository;
    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void addUserToGroup(String userName, String groupName) {
        Group group = groupRepository.findByGroupName(groupName);
        User user = userRepository.findByUserName(userName);
        group.getUsers().add(user);

    }

    @Override
    public User findUserByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }
}
