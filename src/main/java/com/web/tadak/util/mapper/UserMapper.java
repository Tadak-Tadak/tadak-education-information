package com.web.tadak.util.mapper;

import com.web.tadak.dto.user.UserDTO;
import com.web.tadak.entity.user.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper implements EntityMapper<UserDTO, User>{

    @Override
    public UserDTO toDTO(User entity) {
        return UserDTO.builder()
                .id(entity.getId())
                .userId(entity.getUserId())
                .password(entity.getPassword())
                .email(entity.getEmail())
                .nickname(entity.getNickname())
                .majorStatus(entity.getMajorStatus())
                .education(entity.getEducation())
                .createdAt(entity.getCreatedAt())
                .status(entity.getStatus())
                .authProvider(entity.getProviderId())
                .build();
    }

    @Override
    public User toEntity(UserDTO dto) {
        return User.builder()
                .id(dto.getId())
                .userId(dto.getUserId())
                .password(dto.getPassword())
                .email(dto.getEmail())
                .nickname(dto.getNickname())
                .majorStatus(dto.getMajorStatus())
                .education(dto.getEducation())
                .createdAt(dto.getCreatedAt())
                .status(dto.getStatus())
                .providerId(dto.getAuthProvider())
                .build();
    }
}
