package com.web.tadak.entity.course;

import jakarta.persistence.*;
import lombok.*;

//훈련유형
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class TrainingType {

    //훈련유형번호
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //훈련유형이름
    @Column(nullable = false, length = 100)
    private String name;

}
