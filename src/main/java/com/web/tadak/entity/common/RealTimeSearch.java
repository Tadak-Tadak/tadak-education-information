package com.web.tadak.entity.common;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RealTimeSearch {

    //실시간 검색어 PK
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //검색어
    @Column(nullable = false, length = 100)
    private String searchQuery;

    //검색 날짜
    @Column(nullable = false)
    private LocalDateTime searchedAt;

}
