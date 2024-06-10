package com.web.tadak.dto.course;

import lombok.*;

import java.time.LocalDateTime;

//과정 테이블
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CourseDTO {

    private long id;
    private String name;
    private int maxStudent;
    private int trainingDate;
    private int trainingHour;
    private String email;
    private int avgStudentAge;
    private LocalDateTime startedAt;
    private LocalDateTime endedAt;
    private long trainingTypeSeq;
    private long institutionSeq;

}
