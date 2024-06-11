package com.web.tadak.entity.setting;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Font {

    //폰트 PK
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //폰트명
    @Column(nullable = false, length = 50)
    private String name;
    
    //폰트 링크
    @Column(nullable = false, length = 100)
    private String link;

}
