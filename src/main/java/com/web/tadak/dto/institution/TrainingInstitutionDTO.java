package com.web.tadak.dto.institution;


import lombok.*;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TrainingInstitutionDTO {

    private Long id; // 훈련기관의 PK
    private String type; // 훈련기관 유형 이름
}