package com.web.tadak.dto.course;

import lombok.*;

//과정 사후 정보
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CourseAfterInfoDTO {

    private long courseId;
    private String avgWage;
    private double rate;
    private int countGraduates;
    private int countEmployed;
    private double satisfaction;

}
