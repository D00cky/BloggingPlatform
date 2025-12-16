package com.Api.BloggingPlatform.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "POSTS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostModel {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "content")
    private String content;

    @ManyToOne()
    @JoinColumn(name = "post_id")
    private UserModel userModel;

}
