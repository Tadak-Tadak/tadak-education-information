package com.web.tadak.dto.board.suggestion;

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
public class SuggestionDTO {
    
    //건의사항 PK
    private Long id;
    
    //제목
    private String title;
    
    //내용
    private String content;
    
    //작성일
    private LocalDateTime createdAt;
    
    //작성자
    private UserDTO userDTO;
    
}
