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
public class AdminCategories {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 관리자 행동 카테고리 PK 번호

    @Column(nullable = false, length = 2000)
    private String content; // 로그 내용
}
