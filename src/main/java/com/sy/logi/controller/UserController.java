package com.sy.logi.controller;

import com.sy.logi.dto.request.CreateUserRequestDto;
import com.sy.logi.service.UserServiceImpl;
import com.sy.logi.service.impl.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @PostMapping("/register")
    public void createUser(@Valid @RequestBody CreateUserRequestDto createUserRequestDto){
        userService.createUser(createUserRequestDto);

    }
}
