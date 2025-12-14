package com.Api.BloggingPlatform.repository;

import com.Api.BloggingPlatform.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BloggingPostRepository extends JpaRepository<UserModel, Long>  {
    List<UserModel> findByAuthor(String name);

    List<UserModel> findByTitleContaining(String title);
}
