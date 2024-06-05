package com.web.tadak.entity.certification;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.MapsId;
import lombok.*;
import org.springframework.data.annotation.Id;

//분야
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Field {

    //분야 번호
    @Id
    @MapsId("field_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //분야 종류
    @Column(nullable = false)
    private String field_type;
}
