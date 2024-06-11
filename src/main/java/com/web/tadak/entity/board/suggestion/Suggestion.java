package com.web.tadak.entity.board.suggestion;

import com.web.tadak.entity.user.User;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@ToString
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Suggestion {

    //건의사항 PK
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //건의사항 제목
    @Column(nullable = false, length = 100)
    private String title;

    //건의사항 내용
    @Column(nullable = false)
    private String content;

    //건의사항 작성일자
    @Column(nullable = false)
    private LocalDateTime createdAt;

    //작성자
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


}
