package com.web.tadak.entity.board.notice;

import com.web.tadak.entity.admin.Admin;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Notice {

    //공지사항 PK
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //공지사항 제목
    @Column(nullable = false, length = 100)
    private String title;

    //공지사항 내용
    @Column(nullable = false)
    private String content;

    //공지사항 작성일자
    @Column(nullable = false)
    private LocalDateTime createAt;

    //공지사항 조회수
    @Column(nullable = false)
    private Integer viewCount;

    //작성자
    @ManyToOne
    @JoinColumn(name = "admin_id")
    private Admin admin;


}
