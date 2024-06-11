package com.web.tadak.dto.certification;

import lombok.*;

//관련 자격증
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RelatedCertificationsDTO {

    private long certificationId;
    private long courseId;
}
