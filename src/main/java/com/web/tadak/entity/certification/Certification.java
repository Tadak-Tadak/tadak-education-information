package com.web.tadak.entity.certification;

import jakarta.persistence.*;
import lombok.*;

//국가 자격증
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
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
    private String relatedField;

    //취득률
    @Column(nullable = false, length = 10)
    private String acquisitionRate;

    //응시자수
    @Column(nullable = false, length = 30)
    private String numberOfApplicant;

}
