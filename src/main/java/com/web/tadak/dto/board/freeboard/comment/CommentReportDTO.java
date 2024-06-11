package com.web.tadak.dto.board.freeboard.comment;

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
public class CommentReportDTO {
    
    //댓글 신고 PK
    private Long id;
    
    //신고 내용
    private String reportContent;
    
    //신고 일자
    private LocalDateTime reportedAt;
    
    //신고자
    private UserDTO userDTO;
    
    //신고 카테고리
    private String reportCategory;
    
    //해당 댓글
    private CommentDTO commentDTO;
    
}
