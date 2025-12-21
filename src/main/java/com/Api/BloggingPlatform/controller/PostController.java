package com.Api.BloggingPlatform.controller;

import com.Api.BloggingPlatform.model.PostModel;
import com.Api.BloggingPlatform.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/blog")
public class PostController {

    @Autowired
    PostService postService;

    @PostMapping("/post/new")
    public ResponseEntity<Object> createPost(@RequestBody PostModel postModel) {
        return postService.createPost(postModel);
    }
}
