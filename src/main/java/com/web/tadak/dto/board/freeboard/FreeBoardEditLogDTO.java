package com.web.tadak.dto.board.freeboard;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@Builder
public class FreeBoardEditLogDTO {

    //수정이력 PK
    private Long id;

    //수정 전 제목
    private String prevTitle;

    //수정 전 내용
    private String prevContent;

    //수정 날짜
    private LocalDateTime editedAt;

    //해당 게시글
    private FreeBoardDTO freeBoardDTO;

}
