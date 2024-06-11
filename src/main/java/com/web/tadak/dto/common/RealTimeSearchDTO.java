package com.web.tadak.dto.common;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@Builder
public class RealTimeSearchDTO {
    
    //실시간 검색어 PK
    private Long id;
    
    //실시간 검색어
    private String searchQuery;
    
    //검색 시간
    private LocalDateTime searchedAt;
    
}
