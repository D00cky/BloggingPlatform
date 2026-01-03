package com.Api.BloggingPlatform.service;

import com.Api.BloggingPlatform.entity.User;
import com.Api.BloggingPlatform.repository.PostRepository;
import com.Api.BloggingPlatform.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;

    public ResponseEntity<Object> createUser(User user) {
        User newAuthor = new User();
        if(userRepository.findByEmail(user.getEmail()).isPresent()) {
            System.out.println("The email is already registered");
            return ResponseEntity.badRequest().body("The email is already Present, Failed to Create new Post");
        } else {
            user.setAuthor(user.getAuthor());
            user.setEmail(user.getEmail());
            user.setPost(user.getPost());

            User savedUser = userRepository.save(user);
            if (userRepository.findByEmail(savedUser.getEmail()).isPresent()) ;
                    return ResponseEntity.ok("User Created");
        }
    }
}