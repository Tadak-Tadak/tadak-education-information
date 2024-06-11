package com.web.tadak.entity.board.suggestion;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class SuggestionEditLog {

    //건의사항 수정이력 PK
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //건의사항 수정날짜
    @Column(nullable = false)
    private LocalDateTime editedAt;

    //건의사항 수정 전 제목
    @Column(nullable = false, length = 100)
    private String prevTitle;

    //건의사항 수정 전 내용
    @Column(nullable = false)
    private String prevContent;

    //건의사항번호 FK
    @ManyToOne
    @JoinColumn(name = "suggestion_id")
    private Suggestion suggestion;

}
