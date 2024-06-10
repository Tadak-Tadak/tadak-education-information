package com.web.tadak.entity.certification;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

//관련 자격증
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class RelatedCertifications {

    //자격증 번호
    @Id
    @Column(nullable = false, name="certificationId")
    private long certificationId;

    //과정번호
    @Id
    @Column(nullable = false, name="courseId")
    private long courseId;
}
