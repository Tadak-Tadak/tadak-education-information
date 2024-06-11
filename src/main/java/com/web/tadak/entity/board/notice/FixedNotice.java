package com.web.tadak.entity.board.notice;

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
public class FixedNotice {

    //고정 공지사항 PK/FK
    @Id
    @OneToOne
    @JoinColumn(name = "notice_id")
    private Notice notice;

}
