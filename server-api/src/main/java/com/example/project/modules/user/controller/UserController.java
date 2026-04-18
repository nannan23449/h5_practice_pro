package com.example.project.modules.user.controller;

import com.example.project.common.result.Result;
import com.example.project.modules.user.service.UserService;
import com.example.project.modules.user.vo.UserProfileResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/profile")
    public Result<UserProfileResponse> profile() {
        return Result.success(userService.getProfile());
    }
}
