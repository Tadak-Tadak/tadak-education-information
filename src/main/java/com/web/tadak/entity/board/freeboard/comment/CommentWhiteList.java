package com.web.tadak.entity.board.freeboard.comment;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.*;

@Entity
@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CommentWhiteList {

    //댓글 화이트리스트 PK/FK
    @Id
    @JoinColumn(name = "comment_id")
    @OneToOne
    private Comment comment;

}
