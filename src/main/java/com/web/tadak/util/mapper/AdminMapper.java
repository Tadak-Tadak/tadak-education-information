package com.web.tadak.util.mapper;

import com.web.tadak.dto.admin.AdminLogDTO;
import com.web.tadak.dto.admin.AdminToDoDTO;
import com.web.tadak.entity.admin.Admin;
import com.web.tadak.entity.admin.AdminCategory;
import com.web.tadak.entity.admin.AdminLog;
import com.web.tadak.entity.admin.AdminToDo;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class AdminMapper {

    //  AdminLog entity DTO 변환
    public AdminLogDTO toAdminLogDTO(AdminLog adminLog) {
        if (adminLog == null) {
            return null;
        }
        return AdminLogDTO.builder()
                .id(adminLog.getId())
                .createAt(adminLog.getCreateAt())
                .content(adminLog.getContent())
                .adminId(adminLog.getAdmin() != null ? adminLog.getAdmin().getId() : null)
                .adminCategoryId(adminLog.getAdminCategory() != null ? adminLog.getAdminCategory().getId() : null)
                .build();
    }

    //  AdminLog DTO entity 변환
    public AdminLog toAdminLogEntity(AdminLogDTO adminLogDTO) {
        if (adminLogDTO == null) {
            return null;
        }
        return AdminLog.builder()
                .id(adminLogDTO.getId())
                .createAt(adminLogDTO.getCreateAt())
                .content(adminLogDTO.getContent())
                .admin(adminLogDTO.getAdminId() != null ? Admin.builder().id(adminLogDTO.getAdminId()).build() : null)
                .adminCategory(adminLogDTO.getAdminCategoryId() != null ? AdminCategory.builder().id(adminLogDTO.getAdminCategoryId()).build() : null)
                .build();
    }

    //  AdminToDo entity  DTO 변환
    public AdminToDoDTO toAdminToDoDTO(AdminToDo adminToDo) {
        if (adminToDo == null) {
            return null;
        }
        return AdminToDoDTO.builder()
                .id(adminToDo.getId())
                .content(adminToDo.getContent())
                .isDone(adminToDo.getIsDone())
                .createdAt(adminToDo.getCreatedAt())
                .adminId(adminToDo.getAdmin() != null ? adminToDo.getAdmin().getId() : null)
                .build();
    }

    // AdminToDo DTO entity 변환
    public AdminToDo toAdminToDoEntity(AdminToDoDTO adminToDoDTO) {
        if (adminToDoDTO == null) {
            return null;
        }
        return AdminToDo.builder()
                .id(adminToDoDTO.getId())
                .content(adminToDoDTO.getContent())
                .isDone(adminToDoDTO.getIsDone())
                .createdAt(adminToDoDTO.getCreatedAt() != null ? adminToDoDTO.getCreatedAt() : LocalDateTime.now())
                .admin(adminToDoDTO.getAdminId() != null ? Admin.builder().id(adminToDoDTO.getAdminId()).build() : null)
                .build();
    }

    // Admin entity , DTO 변환
    public Admin toAdminEntity(Long adminId) {
        return adminId != null ? Admin.builder().id(adminId).build() : null;
    }

    // AdminCategory , DTO 변환
    public AdminCategory toAdminCategoryEntity(Long adminCategoryId) {
        return adminCategoryId != null ? AdminCategory.builder().id(adminCategoryId).build() : null;
    }

}
