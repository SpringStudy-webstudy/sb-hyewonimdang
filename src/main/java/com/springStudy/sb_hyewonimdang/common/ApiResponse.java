package com.springStudy.sb_hyewonimdang.common;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ApiResponse<T> {
    private int status;
    private String message;
    private T data;

    public static <T> ApiResponse<T> success(T data){
        return new ApiResponse<>(200, "success", data);
    }
}
