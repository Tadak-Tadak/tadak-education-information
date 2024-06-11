package com.web.tadak.entity.board.freeboard;

import com.web.tadak.entity.common.ReportCategory;
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
public class FreeBoardReport {

    //자유게시판 신고 PK
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //신고 내용
    @Column(nullable = false, length = 100)
    private String reportContent;

    //신고 날짜
    @Column(nullable = false)
    private LocalDateTime reported_at;

    //회원번호 FK
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    //카테고리번호 FK
    @ManyToOne
    @JoinColumn(name = "report_category_id")
    private ReportCategory reportCategory;

    //자유게시판 번호 FK
    @ManyToOne
    @JoinColumn(name ="free_board_id")
    private FreeBoard freeBoard;

}
