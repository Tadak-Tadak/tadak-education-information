package com.web.tadak.dto.teacher;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TeacherQualificationIdDTO {

    private Long teacherId; // 강사 테이블 PK
    private Long qualificationId; // 자격 테이블 PK
}