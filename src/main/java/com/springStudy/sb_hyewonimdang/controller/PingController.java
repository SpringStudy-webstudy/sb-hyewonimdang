package com.springStudy.sb_hyewonimdang.controller;
import com.springStudy.sb_hyewonimdang.common.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 서버가 살아있는지 확인할 때
@RestController
@RequestMapping("/api")
public class PingController {

    @GetMapping("/ping")
    public ApiResponse<String> ping(){
        return ApiResponse.success("pong");
    }
}
