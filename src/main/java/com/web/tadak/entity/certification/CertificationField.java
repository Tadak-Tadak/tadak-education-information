package com.web.tadak.entity.certification;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

//자격증 분야
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CertificationField {

    //자격증 번호
    @Id
    @Column(nullable = false, name = "fieldId")
    private long filedId;

    //분야 번호
    @Id
    @Column(nullable = false, name="certificationId")
        private long certificationId;
}
