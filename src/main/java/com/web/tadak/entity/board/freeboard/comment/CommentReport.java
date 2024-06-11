package com.web.tadak.entity.board.freeboard.comment;

import com.web.tadak.entity.common.ReportCategory;
import com.web.tadak.entity.user.User;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CommentReport {

    //댓글 신고 PK
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //신고 내용
    @Column(nullable = false, length = 100)
    private String reportContent;

    //신고 일자
    @Column(nullable = false)
    private LocalDateTime reportedAt;

    //신고 유저 FK
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    //신고 카테고리 FK
    @ManyToOne
    @JoinColumn(name = "report_category_id")
    private ReportCategory reportCategory;

    //신고 댓글 FK
    @ManyToOne
    @JoinColumn(name = "comment_id")
    private Comment comment;



}
