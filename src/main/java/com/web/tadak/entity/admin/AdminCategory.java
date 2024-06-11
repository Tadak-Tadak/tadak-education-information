package com.web.tadak.entity.admin;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@ToString
@Builder(toBuilder = true)  // toBuilder 옵션 추가
@AllArgsConstructor
@NoArgsConstructor
public class AdminCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 관리자 행동 카테고리 PK 번호

    @Column(nullable = false, length = 2000)
    private String content; // 로그 내용
}
