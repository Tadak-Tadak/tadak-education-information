package com.web.tadak.entity.teacher;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 강사 PK 번호

    @Column(nullable = false, length = 10)
    private String name; // 강사 이름

    @Column(nullable = false)
    private Double rating; // 강사 평점

    @Column(nullable = true)
    private int rank; // 강사 순위

    @ManyToOne
    @JoinColumn(name="major_category",nullable = false)
    private MajorCategory majorCategory; // 강사의 전공

}
