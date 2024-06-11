package com.web.tadak.dto.teacher;

import lombok.*;

@Getter
@Setter
@ToString
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class TeacherQualificationDTO {

    private TeacherQualificationIdDTO id; // PK를 복합키로 쓰기 위해 호출
    private TeacherDTO teacher; // 강사 정보
    private QualificationDTO qualification; // 자격 정보
}