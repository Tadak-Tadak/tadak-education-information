package com.web.tadak.dto.board.suggestion.comment;

import com.web.tadak.dto.admin.AdminDTO;
import com.web.tadak.dto.board.suggestion.SuggestionDTO;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@Builder
public class SuggestionCommentDTO {
    
    //건의사항 댓글 PK
    private Long id;
    
    //내용
    private String content;
    
    //작성 일자
    private LocalDateTime createdAt;
    
    //작성자
    private AdminDTO adminDTO;
    
    //해당 글
    private SuggestionDTO suggestionDTO;
    
}
