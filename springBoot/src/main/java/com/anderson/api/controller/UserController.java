package com.anderson.api.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.JsonbHttpMessageConverter;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.anderson.api.api.pojo.User;
import com.anderson.core.service.UserService;


@RestController
@RequestMapping(value="/users")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value="/{userId}", method= RequestMethod.GET)
    public User getUser(@PathVariable Long userId) {
        User user = userService.findById(userId);
        if (user == null)
            return new User();
        else
            return user;
    }

    @PostMapping
    public void saveUser(@Valid @RequestBody User user) {
        userService.saveUser(user);
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
