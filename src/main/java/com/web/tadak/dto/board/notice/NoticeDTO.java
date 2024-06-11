package com.web.tadak.dto.board.notice;

import com.web.tadak.dto.admin.AdminDTO;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@Builder
public class NoticeDTO {

    //공지사항 PK
    private Long id;

    //제목
    private String title;

    //내용
    private String content;

    //작성일
    private LocalDateTime createdAt;

    //조회수
    private Integer viewCount;

    //작성자
    private AdminDTO adminDTO;

}
