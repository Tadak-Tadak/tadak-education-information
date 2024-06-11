package com.web.tadak.entity.board.freeboard;

import com.web.tadak.entity.user.User;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FreeBoard {

    //자유게시판 PK
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //제목
    @Column(nullable = false, length = 100)
    private String title;

    //내용
    @Column(nullable = false)
    private String content;

    //등록날짜
    @Column(nullable = false)
    private LocalDateTime createdAt;

    //조회수
    @Column(nullable = false)
    private Integer viewCount;

    //회원번호
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


}
