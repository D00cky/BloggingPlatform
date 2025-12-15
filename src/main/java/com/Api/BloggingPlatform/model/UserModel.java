package com.Api.BloggingPlatform.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Users")
public class UserModel {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name="author")
        private String name;

        @OneToMany(mappedBy = "UserModel")
        @JoinColumn(name = "author_id")
        private List<PostModel> posts;
}
