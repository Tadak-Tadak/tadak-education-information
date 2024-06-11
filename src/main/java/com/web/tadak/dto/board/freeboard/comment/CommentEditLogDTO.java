package com.web.tadak.dto.board.freeboard.comment;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@Builder
public class CommentEditLogDTO {
    
    //댓글 수정 이력 PK
    private Long id;
    
    //수정 전 내용
    private String prevContent;
    
    //수정 일자
    private LocalDateTime editedAt;
    
    //해당 댓글
    private CommentDTO commentDTO;
    
}
