package com.web.tadak.entity.course;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.MapsId;
import lombok.*;
import org.springframework.data.annotation.Id;

//훈련유형
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TrainingType {

    //훈련유형번호
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //훈련유형이름
    @Column(nullable = false, length = 100)
    private String name;

}
