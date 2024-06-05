package com.web.tadak.entity.board.freeboard;

import com.web.tadak.entity.user.Users;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.*;

@Entity
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FreeboardLike {

    //자유게시판번호
    @Id
    @OneToOne
    @JoinColumn(name = "freeboard_id")
    private FreeBoard freeboardId;

    //회원번호
    @Id
    @OneToOne
    @JoinColumn(name = "user_id")
    private Users userId;

}
