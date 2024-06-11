package com.web.tadak.dto.institution;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CertifiedInstitutionDTO {

    private Long id; // 우수교육기관의 PK
    private String certifiedInstitutionType; // 우수교육기관 인증유형 이름
    private String certifiedIntro; // 인증 유형에 대한 설명
}