package com.web.tadak.entity.teacher;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TeacherQualification { // 강사 자격 테이블

    @EmbeddedId
    private TeacherQualificationId id; // PK를 복합키로 쓰기 위해 호출

    @ManyToOne
    @MapsId("teacherId") // 복합키 매핑
    @JoinColumn(name = "teacher_id", nullable = false)
    private Teacher teacher;

    @ManyToOne
    @MapsId("qualificationId") // 복합키 매핑
    @JoinColumn(name = "qualification_id", nullable = false)
    private Qualification qualification;
}
