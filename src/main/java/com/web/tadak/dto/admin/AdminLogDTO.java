package com.web.tadak.dto.admin;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AdminLogDTO {
    private Long id; // 로그 PK 번호

    private LocalDateTime createAt; //로그 생성 일자 (날짜 )


    private String content; // 로그 내용

    private AdminDTO admin; // 관리자 PK
    private AdminCategoryDTO adminCategory; // 관리자 행동 카테고리 PK

}
