package com.web.tadak.entity.institution;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TrainingInstitution {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //훈련기관의 PK

    @Column(nullable = false, length = 30)
    private String type; // 훈련기관 유형 이름
}
