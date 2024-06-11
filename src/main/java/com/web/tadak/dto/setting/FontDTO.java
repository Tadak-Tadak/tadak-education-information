package com.web.tadak.dto.setting;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
public class FontDTO {

    //폰트 PK
    private Long id;

    //폰트 이름
    private String name;

    //폰트 저장 링크
    private String link;

}
