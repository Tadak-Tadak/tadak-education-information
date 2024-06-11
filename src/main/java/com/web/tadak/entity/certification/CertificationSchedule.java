package com.web.tadak.entity.certification;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

//자격증 일정
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CertificationSchedule {

    //일정 번호
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //시험 종류
    @Column(nullable = false, length = 10)
    private String examType;

    //접수 날짜
    @Column(nullable = false)
    private LocalDateTime submittedAt;

    //시작 날짜
    @Column(nullable = false)
    private LocalDateTime startedAt;

    //종료 날짜
    @Column(nullable = false)
    private LocalDateTime endedAt;

    //자격증 번호
    @ManyToOne
    @JoinColumn(nullable = false, name="certificationId")
    private long certificationId;

}
