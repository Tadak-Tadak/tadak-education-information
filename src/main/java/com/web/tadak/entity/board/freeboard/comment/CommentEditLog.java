package com.web.tadak.entity.board.freeboard.comment;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CommentEditLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 200)
    private String prevContent;

    @Column(nullable = false)
    private LocalDateTime editedAt;

    @ManyToOne
    @JoinColumn(name = "comment_id")
    private Comment comment;



}
