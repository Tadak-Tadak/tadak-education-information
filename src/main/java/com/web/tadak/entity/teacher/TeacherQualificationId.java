package com.web.tadak.entity.teacher;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class TeacherQualificationId implements Serializable { // 복합키를 쓰기 위한 직렬화 코드

    @Column(name = "teacher_id") // 강사 테이블 PK
    private Long teacherId;

    @Column(name = "qualification_id") //자격 테이블 PK
    private Long qualificationId;
}
