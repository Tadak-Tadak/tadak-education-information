package com.web.tadak.dto.teacher;

import lombok.*;

@Getter
@Setter
@ToString
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class TeacherHistoryDTO {

    private Long id; // 강사 과정 이력 번호
    private CourseDTO course; // 과정 번호
    private TeacherDTO teacher; // 강사 번호
}