package com.web.tadak.entity.admin;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Getter
@ToString
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class AdminToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // To-Do PK 번호

    @Column(nullable = false, length = 100)
    private String content; // 할 일 내용


    @Column(nullable = false, length = 1)
    private String isDone; // 할 일 여부 (수행 , 아직 안 함 )


    @Column(nullable = false)
    private LocalDateTime createdAt; //할 일 생성 일자

    @ManyToOne
    @JoinColumn(name = "admin_id", nullable = false)
    private Admin admin; // 관리자 PK

}
