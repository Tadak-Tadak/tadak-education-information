package com.web.tadak.entity.log;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserCategory {

    //카테고리 번호
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //카테고리 내용
    @Column(nullable = false, length = 200)
    private String content;
}
