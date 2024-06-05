package com.web.tadak.entity.certification;

import jakarta.persistence.Column;
import lombok.*;

//자격증 분야
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CertificationField {

    //자격증 번호
    @Column(nullable = false, name = "field_id")
    private long filedId;

    //분야 번호
    @Column(nullable = false, name="certification_id")
    private long certificationId;
}
