package com.web.tadak.entity.board.freeboard;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FreeBoardEditLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime editedAt;

    @Column(nullable = false, length = 100)
    private String prevTitle;

    @Column(nullable = false)
    private String prevContent;

    @ManyToOne
    @JoinColumn(name = "free_board_id")
    private FreeBoard freeBoard;


}
