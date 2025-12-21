package com.Api.BloggingPlatform.controller;

import com.Api.BloggingPlatform.model.PostModel;
import com.Api.BloggingPlatform.repository.PostRepository;
import com.Api.BloggingPlatform.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/blog")
public class PostController {

    private PostService postService;
    private PostRepository postRepository;

    public PostController(PostService postService, PostRepository postRepository) {
        this.postService = postService;
        this.postRepository = postRepository;
    }

    @PostMapping("/post/new")
    public ResponseEntity<Object> createPost(@RequestBody PostModel postModel) {
        return postService.createPost(postModel);
    }
}
