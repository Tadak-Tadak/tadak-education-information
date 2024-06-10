package com.web.tadak.entity.certification;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.MapsId;
import lombok.*;
import org.springframework.data.annotation.Id;

//국가 자격증
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Certification {

    //자격증 번호
    @Id
    @MapsId("certificationId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //자격증 이름
    @Column(nullable = false, length = 100)
    private String name;

    //관련 분야
    @Column(nullable = false, length = 100)
    private String related_field;

    //취득률
    @Column(nullable = false, length = 10)
    private String acquisition_rate;

    //응시자수
    @Column(nullable = false, length = 30)
    private String number_of_applicant;

}
