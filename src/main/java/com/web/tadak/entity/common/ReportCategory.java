package com.web.tadak.entity.common;

import com.web.tadak.entity.user.BlockedUser;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReportCategory {

    //신고차단카테고리 번호
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //신고차단카테고리 내용
    @Column(nullable = false, length = 100)
    private String content;

    @OneToMany(mappedBy = "reportCategory")
    private List<BlockedUser> blockedUsers;

}
