package com.web.tadak.entity.board.freeboard;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FreeBoardWhiteList {

    //자유게시판번호
    @Id
    @OneToOne
    @JoinColumn(name = "free_board_id")
    private FreeBoard freeBoard;

}
