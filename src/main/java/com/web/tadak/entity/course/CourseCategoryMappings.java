package com.web.tadak.entity.course;

import jakarta.persistence.*;
import lombok.*;

//과정_과정카테고리
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CourseCategoryMappings {

    //과정번호
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //과정 카테고리 번호
    @Column(nullable = false)
    private long courseCategoryId;
}
