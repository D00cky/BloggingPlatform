package com.Api.BloggingPlatform.controller;

import com.Api.BloggingPlatform.model.UserModel;
import com.Api.BloggingPlatform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/blog")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user/create")
    public ResponseEntity<Object> createUser(@RequestBody UserModel userModel) {
        return userService.createUser(userModel);
    }



}
