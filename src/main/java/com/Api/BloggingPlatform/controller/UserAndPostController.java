package com.Api.BloggingPlatform.controller;

import com.Api.BloggingPlatform.model.PostModel;
import com.Api.BloggingPlatform.model.UserModel;
import com.Api.BloggingPlatform.service.UserAndPostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blog")
public class UserAndPostController {

    private final UserAndPostService service;

    public UserAndPostController(UserAndPostService service) {
        this.service = service;
    }
}
