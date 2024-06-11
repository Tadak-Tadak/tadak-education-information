package com.web.tadak.dto.user;

import com.web.tadak.dto.common.ReportCategoryDTO;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BlockedUserDTO {

    private Long id;
    private LocalDateTime blockedAt;
    private UserDTO userDTO;
    private ReportCategoryDTO reportCategoryDTO;



}
