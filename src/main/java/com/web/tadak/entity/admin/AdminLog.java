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
public class AdminLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 로그 PK 번호

    @Column(nullable = false)
    private LocalDateTime createAt; //로그 생성 일자 (날짜 )

    @Column(nullable = false, length = 2000)
    private String content; // 로그 내용

    @ManyToOne
    @JoinColumn(name = "admin_id", nullable = false)
    private Admin admin; // 관리자 PK

    @ManyToOne
    @JoinColumn(name = "admin_category_id", nullable = false)
    private AdminCategories adminCategories; // 관리자 행동 카테고리 PK

}
