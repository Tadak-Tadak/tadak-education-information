package com.web.tadak.dto.certification;

import lombok.*;

import java.time.LocalDateTime;

//자격증 일정
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CertificationScheduleDTO {

    private long id;
    private String examType;
    private LocalDateTime submittedAt;
    private LocalDateTime startedAt;
    private LocalDateTime endedAt;
    private long certificationId;
}
