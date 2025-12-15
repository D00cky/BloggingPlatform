package com.Api.BloggingPlatform.service;

import com.Api.BloggingPlatform.model.UserModel;
import com.Api.BloggingPlatform.model.PostModel;
import com.Api.BloggingPlatform.repository.PostRepository;
import com.Api.BloggingPlatform.repository.UserRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserAndPostService {

    private final UserRepository userRepository;
    private final PostRepository postRepository;

    public UserAndPostService(UserRepository userRepo, PostRepository postRepo){
        this.userRepository = userRepo;
        this.postRepository = postRepo;
    }

    public PostModel makeAPost(String author, String title, String content) {
        PostModel newPost = new PostModel();
        newPost.setTitle(title);
        newPost.setContent(content);
        newPost.setAuthor(author);
        return postRepository.save(newPost);
    }
}
