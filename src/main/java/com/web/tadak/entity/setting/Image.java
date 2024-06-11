package com.web.tadak.entity.setting;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Image {

    //이미지 PK
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //이미지 이름
    @Column(nullable = false, length = 100)
    private String name;

    //이미지 링크
    @Column(nullable = false, length = 300)
    private String link;

}
