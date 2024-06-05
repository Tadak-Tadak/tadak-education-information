package com.web.tadak.entity.log;


import com.web.tadak.entity.user.Users;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserLog {

    //회원행동로그 번호
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //회원 번호
    @OneToOne
    @JoinColumn(name = "user_id")
    private Users userId;

    //카테고리 번호
    @OneToOne
    @JoinColumn(name = "user_catefory_id")
    private UserCategory userCategoryId;

    //로그내용
    @Column(nullable = false, length = 100)
    private String logContent;

    //날짜
    @Column(nullable = false)
    private LocalDateTime loggedAt;

}
