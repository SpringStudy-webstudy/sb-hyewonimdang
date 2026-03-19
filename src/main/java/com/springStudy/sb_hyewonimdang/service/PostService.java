package com.springStudy.sb_hyewonimdang.service;

import com.springStudy.sb_hyewonimdang.dto.CreatePostRequest;
import com.springStudy.sb_hyewonimdang.dto.PostResponse;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class PostService {
    public PostResponse create(CreatePostRequest request) {
        // 지금은 임시로 바로 응답 반환 (DB 연동 전)
        return new PostResponse(1L, request.getTitle(), request.getContent());
    }
}
