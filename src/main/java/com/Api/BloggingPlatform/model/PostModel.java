package com.Api.BloggingPlatform.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Posts")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "posts")
    private Long id;

    @Column(name = "title")
    private String title;

    @ManyToOne()
    @JoinColumn(name = "Author", nullable = false)
    @JsonIgnore
    @Column(name = "content")
    private String content;

    @Column(name = "author")
    private String author;

}
