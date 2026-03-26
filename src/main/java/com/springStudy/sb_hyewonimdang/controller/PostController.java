package com.springStudy.sb_hyewonimdang.controller;

import com.springStudy.sb_hyewonimdang.dto.CreatePostRequest;
import com.springStudy.sb_hyewonimdang.dto.PostResponse;
import com.springStudy.sb_hyewonimdang.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import jakarta.validation.Valid;


@RestController
@RequestMapping("/posts")
@RequiredArgsConstructor

public class PostController {
    private final PostService postService;

    @PostMapping
    public ResponseEntity<PostResponse> create(
            @RequestBody @Valid CreatePostRequest request) {
        PostResponse response = postService.create(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/{postId}")
    public ResponseEntity<PostResponse> getPost(@PathVariable Long postId) {
        PostResponse response = postService.getPost(postId);
        return ResponseEntity.ok(response);
    }
}
