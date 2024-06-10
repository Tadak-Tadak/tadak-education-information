package com.web.tadak.entity.board.freeboard;

import com.web.tadak.entity.common.ReportCategory;
import com.web.tadak.entity.user.User;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FreeBoardReport {

    //자유게시판 신고번호
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //회원번호
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    //카테고리번호
    @ManyToOne
    @JoinColumn(name = "report_category_id")
    private ReportCategory reportCategory;

    @ManyToOne
    @JoinColumn(name ="free_board_id")
    private FreeBoard freeBoard;

}
