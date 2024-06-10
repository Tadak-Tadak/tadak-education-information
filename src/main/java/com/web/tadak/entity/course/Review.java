package com.web.tadak.entity.course;

import jakarta.persistence.*;
import lombok.*;

//수강 후기
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Review {

    //수강후기번호
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //내용
    @Column(nullable = false, length = 1000)
    private String content;

    //과정번호
    @Column(nullable = false, name="courseId")
    private String courseId;
    //private Course courseId;

}
