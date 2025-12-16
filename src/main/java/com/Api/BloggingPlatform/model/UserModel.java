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
@Table(name = "USERS")
public class UserModel {

        @Id
        @GeneratedValue
        private Long id;

        @Column(name="AUTHOR_NAME")
        private String name;

        @OneToMany(mappedBy = "userModel")
        private List<PostModel> post;
}
