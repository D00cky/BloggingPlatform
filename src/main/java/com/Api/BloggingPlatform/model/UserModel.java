package com.Api.BloggingPlatform.model;

import com.Api.BloggingPlatform.entity.Post;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserModel {
    private String author;
    private String title;
    private String content;
    private Post post;
}

