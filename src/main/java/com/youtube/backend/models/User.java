package com.youtube.backend.models;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {
    @Id
    private String _id;

    @NotBlank
    private String username;

    @NotBlank
    private String email;

    @NotBlank
    private String fullName;


    private String avatar; // image url in string


    private String coverImage;


    private String password;


    private String refreshToken;

    private Integer subscribersCount;

    @CreatedDate
    private Integer createdAt;
}
