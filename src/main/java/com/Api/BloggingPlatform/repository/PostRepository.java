package com.Api.BloggingPlatform.repository;

import com.Api.BloggingPlatform.model.PostModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<PostModel, Long> {
}
