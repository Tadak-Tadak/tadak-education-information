package com.web.tadak.entity.teacher;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MajorCategory { // 강사 전공 테이블

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 강사 전공 카테고리 번호

    @Column(nullable = false, length = 50)
    private String content; //전공 내용

}
