package com.example.project.modules.user.service.impl;

import com.example.project.modules.user.service.UserService;
import com.example.project.modules.user.vo.UserProfileResponse;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public UserProfileResponse getProfile() {
        return new UserProfileResponse(1L, "demo", "演示用户");
    }
}
