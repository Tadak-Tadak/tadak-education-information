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
@Entity
public class CourseAfterInfo {

    //과정번호
    @Id
    @OneToOne
    @JoinColumn(name="courseId")
    private Course courseId;

    //평균임금
    @Column(nullable = false, length = 20)
    private String avgWage;

    //취업률
    @Column(nullable = false)
    private double rate;

    //수료자수
    @Column(nullable = false)
    private int countGraduates;

    //취업자수
    @Column(nullable = false)
    private int countEmployed;

    //평점
    @Column(nullable = false)
    private double satisfaction;

}
