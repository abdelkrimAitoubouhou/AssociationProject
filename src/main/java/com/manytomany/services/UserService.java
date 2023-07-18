package com.manytomany.services;

import com.manytomany.entities.User;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public interface UserService {
    public User saveUser(User user);
    public void addUserToGroup(String userName, String groupName);
    public User findUserByUserName(String userName);

}
