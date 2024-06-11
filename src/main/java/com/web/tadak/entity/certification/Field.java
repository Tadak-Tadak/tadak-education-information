package com.web.tadak.entity.certification;

import jakarta.persistence.*;
import lombok.*;

//분야
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Field {

    //분야 번호
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //분야 종류
    @Column(nullable = false)
    private String fieldType;
}
