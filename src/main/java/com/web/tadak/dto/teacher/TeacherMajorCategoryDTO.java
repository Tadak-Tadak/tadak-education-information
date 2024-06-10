package com.web.tadak.dto.teacher;

import lombok.*;

@Getter
@Setter
@ToString
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class TeacherMajorCategoryDTO {
    private Long id; // 강사 전공 카테고리 번호
    private String content; //전공 내용
}