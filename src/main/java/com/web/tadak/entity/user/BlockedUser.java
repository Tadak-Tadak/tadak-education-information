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

    //차단날짜 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private LocalDateTime blockedAt;

    //회원번호
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @OneToOne
    @JoinColumn(name = "report_category_id")
    private Users userId;


    //카테고리번호
    @OneToOne
    @JoinColumn(name = "report_category_id")
    private ReportCategory reportCategoryId;

}
