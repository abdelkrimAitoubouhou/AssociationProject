package com.manytomany.Controller;

import com.manytomany.entities.Group;
import com.manytomany.entities.User;
import com.manytomany.services.GroupService;
import com.manytomany.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home")
public class ProjectController {
    @Autowired
    private UserService userService;
    @Autowired
    private GroupService groupService;

    @PostMapping("/saveUser")
    public User saveUser (@RequestBody User user){
        return userService.saveUser(user);
    }

    @PostMapping("/saveGroup")
    public Group saveUser (@RequestBody Group group){
        return groupService.saveGroup(group);
    }



    @GetMapping("/addUserToGroup/username/groupname")
    public void addUserToGroup(@RequestParam String userName,
                               @RequestParam String groupName){
        userService.addUserToGroup(userName, groupName);
    }


    @PostMapping("/findUserByUserName")
    public User findUserByUserName(@RequestBody String userName) {

        return userService.findUserByUserName(userName);
    }












    }
