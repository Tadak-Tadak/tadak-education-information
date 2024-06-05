package com.web.tadak.entity.user;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String memberId;

    @Column(nullable = false, length = 40)
    private String email;

    @Column(nullable = false, length = 20)
    private String password;

    @Column(nullable = false, length = 10)
    private String nickname;

    @Column(nullable = false, length = 10)
    private String majorStatus;

    @Column(nullable = false, length = 10)
    private String education;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false, length = 10)
    private String status;

    @OneToOne
    @JoinColumn(name = "provider_id")
    private AuthProvider providerId;
}
