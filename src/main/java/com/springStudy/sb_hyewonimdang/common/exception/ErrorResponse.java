package com.springStudy.sb_hyewonimdang.common.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ErrorResponse {
    private String code;
    private String message;
    private int status;

    public static ErrorResponse of(String code, String message, int status) {
        return new ErrorResponse(code, message, status);
    }
}
