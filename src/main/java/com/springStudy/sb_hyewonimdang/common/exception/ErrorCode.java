package com.springStudy.sb_hyewonimdang.common.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor

public enum ErrorCode {
    POST_NOT_FOUND("POST_NOT_FOUND", "게시글을 찾을 수 없습니다.", 404),
    UNAUTHORIZED("UNAUTHORIZED", "인증이 필요합니다.", 401),
    VALIDATION_ERROR("VALIDATION_ERROR", "입력값이 올바르지 않습니다.", 400);

    private final String code;
    private final String message;
    private final int status;

    public CustomException toException() {
        return new CustomException(code, message, status);
    }
}
