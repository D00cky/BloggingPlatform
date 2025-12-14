package com.Api.BloggingPlatform.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "Posts")
public class PostModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "posts")
    private Long id;

    @ManyToOne()
    @JoinColumn(name = "Author", nullable = false)
    @JsonIgnore
    private String content;

    private UserModel userModel;
}
