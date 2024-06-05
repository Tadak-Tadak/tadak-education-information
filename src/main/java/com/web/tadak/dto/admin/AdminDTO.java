package com.web.tadak.dto.admin;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AdminDTO {

    private Long id; // 관리자 PK
    private String adminId; // 관리자 아이디
    private String adminPw; //관리자 비밀번호
    private String name; //관리자 이름
    private LocalDateTime createdAt; //관리자 계정 생성 일자
    private String tel; //관리자 전화번호
    private String email; //관리자 이메일
    private String imgUrl = "default-image-url"; // 기본 이미지 URL 설정


    //기본 이미지 보류




}
