package com.web.tadak.entity.board.freeboard.comment;

import com.web.tadak.entity.user.User;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CommentLike {

    //댓글 추천 PK
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //댓글 FK
    @ManyToOne
    @JoinColumn(name = "comment_id")
    private Comment comment;

    //회원 FK
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
