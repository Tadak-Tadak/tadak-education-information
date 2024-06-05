package com.web.tadak.dto.admin;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AdminCategoryDTO {
    private Long id; // 관리자 행동 카테고리 PK 번호
    private String content; // 로그 내용


}
