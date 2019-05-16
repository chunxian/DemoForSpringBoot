package com.company.controller;

import com.company.entity.User;
import com.company.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("admin/")
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping("home")
    String home() {
        String userName = "UUU";
        return "welcome" + userName;
    }

    //http://localhost:8080/admin/userId?id=1
    @RequestMapping("userId")
    User findById(@RequestParam Long id){
        return userService.findById(id);
    }

    //http://localhost:8080/admin/userName?name=Ruth
    @RequestMapping("userName")
    User findName(@RequestParam String name){
        return userService.findName(name);
    }

    //localhost:8080/admin/saveUser
    //POST
 //    {
//        "name":"Test"
//    }
    @RequestMapping("saveUser")
    User save(@RequestBody User user){
        return userService.save(user);
    }

    @PostMapping("modifyUser")
    void updateNamebyId(@RequestBody User user){
        userService.updateNamebyId(user.getId(), user.getName());
    }

    //localhost:8080/admin/deleteUser?id=4
    @PostMapping("deleteUser")
    public void deleteUserById(@RequestParam Long id){
        userService.deleteUserById(id);
    }

}
