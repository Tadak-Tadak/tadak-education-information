package com.web.tadak.entity.user;

import com.web.tadak.entity.common.ReportCategory;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BlockedUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //차단날짜 
    private LocalDateTime blockedAt;

    //회원번호
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    //카테고리번호
    @ManyToOne
    @JoinColumn(name = "report_category_id")
    private ReportCategory reportCategory;

}
