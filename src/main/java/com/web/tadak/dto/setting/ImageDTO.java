package com.web.tadak.dto.setting;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
public class ImageDTO {

    //이미지 PK
    private Long id;

    //이미지 이름
    private String name;

    //이미지 링크
    private String link;

}
