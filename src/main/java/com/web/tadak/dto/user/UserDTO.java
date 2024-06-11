package com.web.tadak.dto.user;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {

    private Long id;
    private String userId;
    private String email;
    private String nickname;
    private String majorStatus;
    private String education;
    private LocalDateTime createdAt;
    private String status;
    private String providerName;
    private AuthProviderDTO authProviderDTO;



}
