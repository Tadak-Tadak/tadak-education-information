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
    private LocalDateTime createAt; // 로그 생성 일자
    private String content; // 로그 내용
    private Long adminId; // 관리자 ID (참조)
    private Long adminCategoryId; // 관리자 행동 카테고리 ID (참조)
}
