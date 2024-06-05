package com.web.tadak.entity.admin;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 관리자 PK

    @Column(nullable = false, length = 20)
    private String adminId; // 관리자 아이디

    @Column(nullable = false, length = 20)
    private String adminPw; //관리자 비밀번호

    @Column(nullable = false, length = 10)
    private String name; //관리자 이름

    @Column(nullable = false)
    private LocalDateTime createdAt; //관리자 계정 생성 일자

    @Column(nullable = false, length = 30)
    private String tel; //관리자 전화번호

    @Column(nullable = false, length = 40)
    private String email; //관리자 이메일

    @Column(nullable = false, length = 300)
    private String imgUrl = "default-image-url"; // 기본 이미지 URL 설정

    @PrePersist
    protected void onCreate() {
        if (createdAt == null) {
            createdAt = LocalDateTime.now();
        }
        if (imgUrl == null || imgUrl.isEmpty()) {
            imgUrl = "default-image-url"; // 기본 이미지 URL 설정 (url 저기 넣으면 됨)
        }
    }
}
