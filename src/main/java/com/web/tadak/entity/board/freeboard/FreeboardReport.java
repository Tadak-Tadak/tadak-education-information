package com.web.tadak.entity.board.freeboard;

import com.web.tadak.entity.common.ReportCategory;
import com.web.tadak.entity.user.Users;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FreeboardReport {

    //자유게시판 신고번호
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //회원번호
    @Id
    @OneToOne
    @JoinColumn(name = "user_id")
    private Users userId;

    //카테고리번호
    @OneToOne
    @JoinColumn(name = "report_category_id")
    private ReportCategory reportCategoryId;
}
