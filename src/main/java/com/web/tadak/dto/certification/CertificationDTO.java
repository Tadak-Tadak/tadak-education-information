package com.web.tadak.dto.certification;

import lombok.*;

//국가 자격증
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CertificationDTO {

    private long id;
    private String name;
    private String relatedField;
    private String acquisitionRate;
    private String numberOfApplicant;

}
