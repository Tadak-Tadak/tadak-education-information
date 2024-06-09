package com.web.tadak.dto.user;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BlockedUserDTO {

    private LocalDateTime blockedAt;
    private UserDTO userDTO;
//    private ReportCategoryDTO reportCategoryDTO;



}
