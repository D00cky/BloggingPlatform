package com.Api.BloggingPlatform.model;

import jakarta.persistence.*;

@Entity
@Table(name = "POST_AUTHOR")
public class UserModel {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "AUTHOR", unique = true)
    private String author;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }



}
