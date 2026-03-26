package com.springStudy.sb_hyewonimdang.service;

import com.springStudy.sb_hyewonimdang.common.exception.CustomException;
import com.springStudy.sb_hyewonimdang.common.exception.ErrorCode;
import com.springStudy.sb_hyewonimdang.domain.Post;
import com.springStudy.sb_hyewonimdang.dto.CreatePostRequest;
import com.springStudy.sb_hyewonimdang.dto.PostResponse;
import com.springStudy.sb_hyewonimdang.repository.PostRepository;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class PostService {
    private final PostRepository postRepository;

    public PostResponse create(CreatePostRequest request) {
        Post post = Post.create(request.getTitle(), request.getContent(), 1L); // userId는 임시로 1L
        Post saved = postRepository.save(post);
        return new PostResponse(saved.getPostId(), saved.getTitle(), saved.getContent());
    }

    public PostResponse getPost(Long postId) {
        Post post = postRepository.findById(postId)
                .orElseThrow(() -> ErrorCode.POST_NOT_FOUND.toException());
        return new PostResponse(post.getPostId(), post.getTitle(), post.getContent());
    }
}
