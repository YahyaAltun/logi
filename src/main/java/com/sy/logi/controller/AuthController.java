package com.sy.logi.controller;

import com.sy.logi.dto.request.LoginRequestDto;
import com.sy.logi.dto.request.RegisterRequestDto;
import com.sy.logi.dto.response.JwtResponseDto;
import com.sy.logi.service.impl.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/user")
public class AuthController {

    private final AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<JwtResponseDto> authenticateUser(@Valid @RequestBody LoginRequestDto loginRequestDto) {
        JwtResponseDto jwtResponse = authService.authenticateUser(loginRequestDto);
        return ResponseEntity.ok(jwtResponse);
    }

    @PostMapping("/register")
    public void createUser(@Valid @RequestBody RegisterRequestDto createUserRequestDto){
        authService.createUser(createUserRequestDto);
    }
}
