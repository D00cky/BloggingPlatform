package com.Api.BloggingPlatform.service;

import com.Api.BloggingPlatform.model.UserModel;
import com.Api.BloggingPlatform.repository.BloggingPostRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserAndPostService {

    private BloggingPostRepository repository;
    private UserModel userAndPostModel;


    public UserModel getPostById(int id) {
        return repository.findById(id).get();
    }

    public void createPost  (UserModel userAndPostModel) {
        repository.save(userAndPostModel);
    }

    public List <UserModel> getAllPosts() {
        List<UserModel> allPosts = new ArrayList<UserModel>();
        repository.findAll().forEach(userAndPostModel -> allPosts.add(userAndPostModel));
        return allPosts;
    }
}
