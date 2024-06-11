package com.web.tadak.entity.course;

import jakarta.persistence.*;
import lombok.*;

//과정 사후 정보
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CourseAfterInfo {

    @Id
    @OneToOne
    @JoinColumn(name="courseId")
    private long courseId;

    @Column(nullable = false, length = 20)
    private String avgWage;

    @Column(nullable = false)
    private double rate;

    @Column(nullable = false)
    private int countGraduates;

    @Column(nullable = false)
    private int countEmployed;

    @Column(nullable = false)
    private double satisfaction;

}
