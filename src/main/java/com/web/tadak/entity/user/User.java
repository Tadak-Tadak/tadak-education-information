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
public class User {

    //회원번호 PK
    @Id
    @MapsId("user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //아이디
    @Column(nullable = false, length = 20)
    private String memberId;

    //이메일
    @Column(nullable = false, length = 40)
    private String email;

    //비밀번호
    @Column(nullable = false, length = 20)
    private String password;

    //닉네임
    @Column(nullable = false, length = 10)
    private String nickname;

    //전공유무
    @Column(nullable = false, length = 10)
    private String majorStatus;

    //학력
    @Column(nullable = false, length = 30)
    private String education;

    //가입일
    @Column(nullable = false)
    private LocalDateTime createdAt;

    //상태
    @Column(nullable = false, length = 10)
    private String status;

    //로그인 방식 FK
    @OneToOne
    @JoinColumn(name = "provider_id")
    private AuthProvider provider;



}
