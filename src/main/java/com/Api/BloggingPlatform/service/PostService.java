package com.Api.BloggingPlatform.service;

import com.Api.BloggingPlatform.model.PostModel;
import com.Api.BloggingPlatform.repository.PostRepository;
import com.Api.BloggingPlatform.repository.UserRepository;


import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class PostService {

    @Autowired
    PostRepository postRepository;

    @Autowired
    UserRepository userRepository;

    @Transactional
    public ResponseEntity<Object> createPost(PostModel postModel) {
        PostModel newPost = new PostModel();
        newPost.setAuthor(postModel.getAuthor());
        newPost.setTitle(postModel.getTitle());
        newPost.setContent(postModel.getContent());

        newPost.setUserModel(postModel.getUserModel());
        PostModel savePost = postRepository.save(newPost);
        if (postRepository.findById(savePost.getId()).isPresent()) {
            return ResponseEntity.accepted().body("Post created");
        } else {
            return ResponseEntity.unprocessableContent().body("Failed to Create specified role");
        }
    }

//    public void makeAPost(PostModel postModel, UserModel userModel) {
//        userModel.setAuthor(postModel.getAuthor());
//
//        postRepository.save(postModel);
//        userRepository.save(userModel);
//    }
}
