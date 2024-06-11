package com.web.tadak.entity.course;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

//과정 테이블
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Course {

    //과정번호
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //과정명
    @Column(nullable = false, length = 100)
    private String name;

    //모집인원
    @Column
    private int maxStudent;

    //훈련일
    @Column(nullable = false)
    private int trainingDate;

    //훈련시간
    @Column(nullable = false)
    private int trainingHour;

    //이메일
    @Column(length = 40)
    private String email;

    //수강생 평균 연령
    @Column
    private int avgStudentAge;

    //과정시작일
    @Column(nullable = false)
    private LocalDateTime startedAt;

    //과정종료일
    @Column(nullable = false)
    private LocalDateTime endedAt;

    //훈련유형번호
    @ManyToOne
    @JoinColumn(nullable = false, name="trainingTypesId")
    private TrainingType trainingTypeSeq;

    //기관번호
//    @ManyToOne
//    @JoinColumn(nullable = false, name="institutionsId")
//    private Institutions institutionSeq;

}
