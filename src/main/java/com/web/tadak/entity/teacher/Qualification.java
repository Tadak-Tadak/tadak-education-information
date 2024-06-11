package com.web.tadak.entity.teacher;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Qualification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 자격 카테고리 번호


    @Column(nullable = true, length = 300)
    private String content; //자격 내용
}
