package com.web.tadak.dto.board.freeboard;

import com.web.tadak.dto.user.UserDTO;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@Builder
public class FreeBoardDTO {

    //게시판 PK
    private Long id;

    //제목
    private String title;

    //내용
    private String content;

    //작성일자
    private LocalDateTime createdAt;

    //조회수
    private Integer viewCount;

    //작성자
    private UserDTO userDTO;

}
