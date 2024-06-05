package com.web.tadak.entity.certification;

import jakarta.persistence.Column;
import lombok.*;

//관련 자격증
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RelatedCertifications {

    //자격증 번호
    @Column(nullable = false, name="certification_id")
    private long certificationId;

    //과정번호
    @Column(nullable = false, name="course_id")
    private long courseId;
}
