package com.web.tadak.dto.admin;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ToDoDTO {

    private Long id; // To-Do PK 번호
    private String content; // 할 일 내용
    private String isDone; // 할 일 여부 (수행 , 아직 안 함 )
    private LocalDateTime createdAt; //할 일 생성 일자
    private AdminDTO admin; // 관리자 PK



}
