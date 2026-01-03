package com.Api.BloggingPlatform.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "POST_AUTHOR")
public class User {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "AUTHOR")
    private String author;
    @Column(name = "EMAIL")
    private String email;
    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    private Post post;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}
