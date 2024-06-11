package com.web.tadak.dto.board.freeboard.comment;

import com.web.tadak.dto.user.UserDTO;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@ToString
@Builder
public class CommentDTO {

    //댓글 PK
    private Long id;

    //댓글 내용
    private String content;

    //작성일
    private LocalDateTime createdAt;

    //부모 댓글 id
    private Long parentId;

    //작성자
    private UserDTO userDTO;

    //자식 댓글
    private List<CommentDTO> children;

}
