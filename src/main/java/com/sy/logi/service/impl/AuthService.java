package com.sy.logi.service.impl;

import com.sy.logi.dto.request.LoginRequestDto;
import com.sy.logi.dto.request.RegisterRequestDto;
import com.sy.logi.dto.response.JwtResponseDto;
import org.springframework.stereotype.Service;

@Service
public interface AuthService {
    JwtResponseDto authenticateUser(LoginRequestDto loginRequestDto);
    void createUser(RegisterRequestDto RegisterDto);
}
