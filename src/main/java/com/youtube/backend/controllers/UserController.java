package com.youtube.backend.controllers;

import com.youtube.backend.utils.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @PostMapping(value = "/login")
    public ResponseEntity<ApiResponse> loginUser(){
        return null;
    }

    @PostMapping(value = "/register")
    public ResponseEntity<ApiResponse> registerUser(){
        return null;
    }

    @PostMapping(value = "/logout")
    public ResponseEntity<ApiResponse> logoutUser(){return  null;}



    @PatchMapping(value = "/change-password")
    public ResponseEntity<ApiResponse> updateUserPassword(){return null;}

    @PatchMapping(value = "/avatar")
    public ResponseEntity<ApiResponse> updateUserAvatar(){return null;}

    @PatchMapping(value = "/cover-image")
    public ResponseEntity<ApiResponse> updateUserCoverImage(){return null;}

    @PutMapping(value = "/update-account")
    public ResponseEntity<ApiResponse> updateUserAccount(){return null;}



    @GetMapping(value = "/history")
    public ResponseEntity<ApiResponse> getUserWatchHistory(){return null;}

}
