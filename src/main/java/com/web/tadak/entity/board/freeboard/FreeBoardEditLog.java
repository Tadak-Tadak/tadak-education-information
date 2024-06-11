package com.web.tadak.entity.board.freeboard;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FreeBoardEditLog {

    //자유게시판 수정이력 PK
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //수정일자
    @Column(nullable = false)
    private LocalDateTime editedAt;

    //수정 전 제목
    @Column(nullable = false, length = 100)
    private String prevTitle;

    //수정 전 내용
    @Column(nullable = false)
    private String prevContent;

    //자유게시판 번호 FK
    @ManyToOne
    @JoinColumn(name = "free_board_id")
    private FreeBoard freeBoard;


}
