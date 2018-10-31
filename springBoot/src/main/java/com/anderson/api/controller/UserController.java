package com.anderson.api.controller;

import java.util.Optional;
import java.util.function.Consumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.anderson.api.api.pojo.User;
import com.anderson.core.repository.UserRepository;
import com.anderson.core.service.UserService;

@RestController
@RequestMapping(value="/users")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value="/{userId}", method= RequestMethod.GET)
    public User getUser(@PathVariable Long userId) {
        return userService.findById(userId);
    }

    @RequestMapping(value="/{userId}", method=RequestMethod.POST)
    public void updateUser(@PathVariable Long userId) {

    }


//    @RequestMapping(value="/{userId}", method=RequestMethod.PUT)
//    public User createUser(@PathVariable Long userId) {
//
//    }
//
//    @RequestMapping(value="/{userId}", method=RequestMethod.DELETE)
//    public User deleteUser(@PathVariable Long userId) {
//
//    }
}
