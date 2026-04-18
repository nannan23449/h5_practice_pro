package com.example.project.modules.auth.service.impl;

import com.example.project.common.exception.BusinessException;
import com.example.project.modules.auth.dto.LoginRequest;
import com.example.project.modules.auth.service.AuthService;
import com.example.project.modules.auth.vo.LoginResponse;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public LoginResponse login(LoginRequest request) {
        if (!"demo".equals(request.getUsername()) || !"123456".equals(request.getPassword())) {
            throw new BusinessException("账号或密码错误");
        }
        return new LoginResponse("demo-token");
    }
}
