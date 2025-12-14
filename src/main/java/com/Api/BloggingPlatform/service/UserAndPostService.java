package com.Api.BloggingPlatform.service;

import com.Api.BloggingPlatform.model.UserModel;
import com.Api.BloggingPlatform.repository.UserRepository;
import jakarta.annotation.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserAndPostService {

    @Autowired
    UserRepository userRepository;

    public ResponseEntity<List<UserModel>> getAllPosts(String title) {
        List<UserModel> userpost = new ArrayList<UserModel>();

        if (title == null)
            userRepository.findAll().forEach(userpost::add);
        else
            userRepository.findByTitleContaining(title).forEach(userpost::add);
        if (userpost.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    return new ResponseEntity<>(userpost, HttpStatus.OK);
    }
}
