package com.sy.logi.service;

import com.sy.logi.dto.request.RegisterRequestDto;
import com.sy.logi.entity.User;
import com.sy.logi.repository.UserRepository;
import com.sy.logi.service.impl.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public void createUser(RegisterRequestDto createUserRequestDto) {

        User user = new User();
        user.setEmail(createUserRequestDto.getEmail());
        user.setFirstName(createUserRequestDto.getFirstName());
        user.setLastName(createUserRequestDto.getLastName());
        user.setPassword(createUserRequestDto.getPassword());

        userRepository.save(user);
    }
}
