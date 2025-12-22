package com.Api.BloggingPlatform.service;

import com.Api.BloggingPlatform.model.PostModel;
import com.Api.BloggingPlatform.model.UserModel;
import com.Api.BloggingPlatform.repository.UserRepository;


import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostService postService;

//    @Transactional
//    public ResponseEntity<Object> createPost(UserModel userModel, PostModel postModel) {
//        UserModel myAuthor = new UserModel();
//        myAuthor.setAuthor(postModel.getAuthor());
//        UserModel saveAuthor = userRepository.save(myAuthor);
//
//        if(userRepository.findById(saveAuthor.getId()).isPresent()) {
//            return ResponseEntity.accepted().body("UserCreated");
//        }else{
//            return ResponseEntity.unprocessableContent().body("Failed to create user");
//        }
//    }
}