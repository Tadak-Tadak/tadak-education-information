package com.web.tadak.entity.board.freeboard;

import com.web.tadak.entity.user.User;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FreeBoardLike {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //자유게시판번호
    @ManyToOne
    @JoinColumn(name = "free_board_id")
    private FreeBoard freeBoard;

    //회원번호
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
