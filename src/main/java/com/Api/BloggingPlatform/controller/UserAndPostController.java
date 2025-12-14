package com.Api.BloggingPlatform.controller;

import com.Api.BloggingPlatform.model.UserModel;
import com.Api.BloggingPlatform.service.UserAndPostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blog")
public class UserAndPostController {

    private UserAndPostService service;

    @PostMapping("/createPost")
    public void createPost(@RequestBody UserModel userAndPostModel) {
        service.createPost(userAndPostModel);
    }

    @GetMapping("/allPosts")
    public List<UserModel> getAllPosts(){
        return service.getAllPosts();
    }
}
