package com.web.tadak.entity.course;

import jakarta.persistence.*;
import lombok.*;

//과정 카테고리
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CourseCategories {

    //과정 카테고리 번호
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //내용
    @Column(length = 200)
    private String content;
}
