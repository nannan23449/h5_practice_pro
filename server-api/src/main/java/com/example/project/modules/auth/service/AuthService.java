package com.example.project.modules.auth.service;

import com.example.project.modules.auth.dto.LoginRequest;
import com.example.project.modules.auth.vo.LoginResponse;

public interface AuthService {

    LoginResponse login(LoginRequest request);
}
