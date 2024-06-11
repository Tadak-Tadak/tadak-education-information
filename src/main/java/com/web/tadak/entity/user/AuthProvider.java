package com.web.tadak.entity.user;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthProvider {

    //가입플랫폼 PK
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //가입플랫폼명
    @Column(nullable = false, length = 20)
    private String provider;


}