package com.web.tadak.entity.common;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReportCategory {

    //신고차단카테고리 번호
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //신고차단카테고리 내용
    @Column(nullable = false, length = 100)
    private String content;

}
