package com.Api.BloggingPlatform.repository;

import com.Api.BloggingPlatform.model.PostModel;
import com.Api.BloggingPlatform.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<PostModel, Long>  {
    List<PostModel> findPostById(Long postId);
    List<PostModel> deletePostById(long userId);
}
