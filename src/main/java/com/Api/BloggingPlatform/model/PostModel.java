package com.Api.BloggingPlatform.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Posts")
public class PostModel {

    @Id
    @ManyToOne()
    private Long id;
}
