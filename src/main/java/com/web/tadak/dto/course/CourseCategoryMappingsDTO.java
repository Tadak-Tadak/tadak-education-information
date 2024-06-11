package com.web.tadak.dto.course;

import lombok.*;

//과정_과정카테고리
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CourseCategoryMappingsDTO {

    private long id;
    private long courseCategoryId;
}
