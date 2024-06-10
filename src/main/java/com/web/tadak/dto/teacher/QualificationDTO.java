package com.web.tadak.dto.teacher;

import lombok.*;

@Getter
@Setter
@ToString
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class QualificationDTO {

    private Long id; // 자격 카테고리 번호
    private String content; //자격 내용
}