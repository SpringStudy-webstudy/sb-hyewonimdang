package com.springStudy.sb_hyewonimdang.common.exception;

import lombok.Getter;

@Getter
public class CustomException extends RuntimeException{
    private final String code;
    private final int status;

    public CustomException(String code, String message, int status) {
        super(message);
        this.code = code;
        this.status = status;
    }
}
