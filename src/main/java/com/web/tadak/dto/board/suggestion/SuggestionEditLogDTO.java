package com.web.tadak.dto.board.suggestion;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@Builder
public class SuggestionEditLogDTO {

    //수정이력 PK
    private Long id;

    //수정 전 제목
    private String prevTitle;

    //수정 전 내용
    private String prevContent;

    //수정 일자
    private LocalDateTime editedAt;

    //해당 수정 글
    private SuggestionDTO suggestionDTO;

}
