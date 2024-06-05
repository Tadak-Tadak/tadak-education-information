package com.web.tadak.entity.board.freeboard;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FreeboardWhiteList {

    //자유게시판번호
    @Id
    @OneToOne
    @JoinColumn(name = "id")
    private FreeBoard freeBoardId;

}
