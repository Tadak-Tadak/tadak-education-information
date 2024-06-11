package com.web.tadak.dto.course;

import lombok.*;

//수강 후기
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ReviewDTO {

    private long id;
    private String content;
    private String courseId;
}
