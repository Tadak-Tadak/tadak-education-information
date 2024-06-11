package com.web.tadak.entity.board.suggestion.comment;

import com.web.tadak.entity.admin.Admin;
import com.web.tadak.entity.board.suggestion.Suggestion;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@ToString
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SuggestionComment {

    // 건의사항 답변 PK
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 답변 내용
    @Column(nullable = false)
    private String content;

    // 작성 일자
    @Column(nullable = false)
    private LocalDateTime createdAt;

    // 관리자 FK
    @ManyToOne
    @JoinColumn(name = "admin_id")
    private Admin admin;

    // 건의사항 FK
    @ManyToOne
    @JoinColumn(name = "suggestion_id")
    private Suggestion suggestion;

}
