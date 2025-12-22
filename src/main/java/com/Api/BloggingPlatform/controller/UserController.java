package com.Api.BloggingPlatform.controller;

import com.Api.BloggingPlatform.model.PostModel;
import com.Api.BloggingPlatform.model.UserModel;
import com.Api.BloggingPlatform.repository.UserRepository;

import com.Api.BloggingPlatform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/blog")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    UserRepository userRepository;
}
