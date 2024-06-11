package com.web.tadak.entity.board.freeboard.comment;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Comment {

    //댓글 PK
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //댓글 내용
    @Column(nullable = false, length = 200)
    private String content;

    //작성일자
    @Column(nullable = false)
    private LocalDateTime createdAt;

    //부모 댓글
    @ManyToOne
    @JoinColumn(name = "parent_id", nullable = true)
    private Comment parent;

    //자식 댓글 리스트(컬럼X)
    @OneToMany(mappedBy = "parent_id")
    private List<Comment> children = new ArrayList<>();

}
