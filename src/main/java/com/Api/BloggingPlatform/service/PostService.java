package com.Api.BloggingPlatform.service;

import com.Api.BloggingPlatform.entity.Post;
import com.Api.BloggingPlatform.repository.PostRepository;
import com.Api.BloggingPlatform.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    private PostRepository postRepository;
    private UserRepository userRepository;

    public PostService(PostRepository postRepository, UserRepository userRepository) {
        this.postRepository = postRepository;
        this.userRepository = userRepository;
    }

    public ResponseEntity<Object> addPost(Post post) {
        Post newPost = new Post();
        newPost.setAuthor(post.getAuthor());
        newPost.setTitle(post.getTitle());
        newPost.setContent(post.getContent());
        newPost.setUser(post.getUser());
        Post savedPost = postRepository.save(newPost);
        if(postRepository.findById(savedPost.getId()).isPresent()){
            return ResponseEntity.accepted().body("Post Created");
        } else
            return ResponseEntity.unprocessableContent().body("Post Not Created");
    }
}
