package com.web.tadak.dto.institution;



import lombok.*;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class InstitutionDTO {

    private Long id; // 기관 PK 번호
    private String name; // 기관 이름
    private String address; // 기관 실제 물리적 주소
    private String tel; // 기관 전화번호
    private String introduce; // 기관 소개 내용
    private String email; // 기관 이메일
    private Double rating; // 기관 평점
    private Double employmentRate; // 기관의 취업률
    private String hrdLink; // 기관의 HRD 링크 주소
    private TrainingInstitutionDTO trainingInstitution; // 훈련기관의 DTO
    private CertifiedInstitutionDTO certifiedInstitution; // 우수교육기관 DTO
}