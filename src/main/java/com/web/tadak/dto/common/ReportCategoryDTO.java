package com.web.tadak.dto.common;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class ReportCategoryDTO {

    //신고 카테고리 PK
    private Long id;

    //신고 카테고리 내용
    private String content;

}
