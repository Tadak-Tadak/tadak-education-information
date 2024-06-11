package com.web.tadak.dto.teacher;


import lombok.*;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TeacherDTO {

    private Long id; // 강사 PK 번호
    private String name; // 강사 이름
    private Double rating; // 강사 평점
    private int rank; // 강사 순위 (nullable이지만 primitive 타입이므로 기본값이 0으로 설정됩니다)
    private MajorCategoryDTO majorCategory; // 강사의 전공
}
