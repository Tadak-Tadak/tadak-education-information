package com.web.tadak.entity.institution;


import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Institution {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //기관 PK 번호

    @Column(nullable = false, length = 50)
    private String name; //기관 이름

    @Column(nullable = false, length = 15)
    private String address; //기관 실제 물리적 주소

    @Column(nullable = false, length = 30)
    private String tel; //기관 전화번호

    @Column(nullable = false, length = 2000)
    private String introduce; //기관 소개 내용

    @Column(nullable = false, length = 30)
    private String email; //기관 이메일

    @Column(nullable = false)
    private Double rating; //기관 평점

    @Column(nullable = false)
    private Double employmentRate; //기관의 취업률

    @Column(nullable = false, length = 1000)
    private String hrdLink; // 기관의 HRD 링크 주소

    @ManyToOne
    @JoinColumn(name = "trainingInstitution_id", nullable = false)
    private TrainingInstitution trainingInstitution; //훈련기관의 PK

    @ManyToOne
    @JoinColumn(name = "certifiedInstitution_id", nullable = false)
    private CertifiedInstitution certifiedInstitution; //우수교육기관 PK


}
