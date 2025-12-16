package com.Api.BloggingPlatform.controller;

import com.Api.BloggingPlatform.model.PostModel;
import com.Api.BloggingPlatform.model.UserModel;
import com.Api.BloggingPlatform.repository.PostRepository;
import com.Api.BloggingPlatform.service.UserAndPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blog")
public class  UserAndPostController {

    @Autowired
    UserAndPostService userAndPostService;

    @PostMapping("/newpost")
    public void createPost(@RequestBody PostModel postModel) {
        userAndPostService.makeAPost(postModel);
    }
}
