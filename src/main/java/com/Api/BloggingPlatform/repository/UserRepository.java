package com.Api.BloggingPlatform.repository;

import com.Api.BloggingPlatform.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long>  {
}
