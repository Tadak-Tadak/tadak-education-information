package com.web.tadak.entity.institution;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CertifiedInstitution {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 우수교육기관의 PK

    @Column(nullable = false, length = 30)
    private String certifiedInstitutionType; //우수교육기관 인증유형 이름

    @Column(nullable = false, length = 200)
    private String certifiedIntro; //인증 유형에 대한 설명
}