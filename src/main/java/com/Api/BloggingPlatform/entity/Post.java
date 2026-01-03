package com.Api.BloggingPlatform.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="USERS_POST")
public class Post {

    @Id
    @GeneratedValue
    private Long Id;

    @Column(name="author")
    private String author;

    @Column(name="title")
    private String title;

    @Column(name="content")
    private String content;

    @JoinColumn(name = "post_id")
    @OneToMany(targetEntity = User.class, cascade = CascadeType.ALL)
    private List<User> user;


    public Long getId(){
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getContent(){
        return content;
    }

    public void setContent(String content){
        this.content = content;
    }

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }



}
