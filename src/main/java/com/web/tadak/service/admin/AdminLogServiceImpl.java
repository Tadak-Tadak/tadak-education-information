package com.web.tadak.service.admin;

import com.web.tadak.dto.admin.AdminLogDTO;
import com.web.tadak.entity.admin.Admin;
import com.web.tadak.entity.admin.AdminCategory;
import com.web.tadak.entity.admin.AdminLog;
import com.web.tadak.repository.admin.AdminLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class AdminLogServiceImpl implements AdminLogService {

    @Autowired
    private AdminLogRepository adminLogRepository;

    @Override
    public AdminLogDTO createAdminLog(AdminLogDTO adminLogDTO) {
        AdminLog adminLog = dtoToEntity(adminLogDTO);
        AdminLog savedAdminLog = adminLogRepository.save(adminLog);
        return entityToDTO(savedAdminLog);
    }

    @Override
    public Optional<AdminLogDTO> getAdminLogById(Long id) {
        return adminLogRepository.findById(id).map(this::entityToDTO);
    }

    @Override
    public List<AdminLogDTO> getAllAdminLogs() {
        return adminLogRepository.findAll().stream()
                .map(this::entityToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public AdminLogDTO updateAdminLog(Long id, AdminLogDTO adminLogDTO) {
        Optional<AdminLog> existingAdminLogOpt = adminLogRepository.findById(id);
        if (existingAdminLogOpt.isPresent()) {
            AdminLog existingAdminLog = existingAdminLogOpt.get();
            AdminLog updatedAdminLog = existingAdminLog.toBuilder()
                    .createAt(adminLogDTO.getCreateAt())
                    .content(adminLogDTO.getContent())
                    .admin(Admin.builder().id(adminLogDTO.getAdminId()).build()) // Only setting ID
                    .adminCategory(AdminCategory.builder().id(adminLogDTO.getAdminCategoryId()).build()) // Only setting ID
                    .build();
            adminLogRepository.save(updatedAdminLog);
            return entityToDTO(updatedAdminLog);
        } else {
            // 예외 처리 (예: EntityNotFoundException)
            return null;
        }
    }

    @Override
    public void deleteAdminLog(Long id) {
        adminLogRepository.deleteById(id);
    }

    private AdminLogDTO entityToDTO(AdminLog adminLog) {
        return AdminLogDTO.builder()
                .id(adminLog.getId())
                .createAt(adminLog.getCreateAt())
                .content(adminLog.getContent())
                .adminId(adminLog.getAdmin() != null ? adminLog.getAdmin().getId() : null) // Null check
                .adminCategoryId(adminLog.getAdminCategory() != null ? adminLog.getAdminCategory().getId() : null) // Null check
                .build();
    }

    private AdminLog dtoToEntity(AdminLogDTO adminLogDTO) {
        return AdminLog.builder()
                .id(adminLogDTO.getId())
                .createAt(adminLogDTO.getCreateAt())
                .content(adminLogDTO.getContent())
                .admin(Admin.builder().id(adminLogDTO.getAdminId()).build()) // Only setting ID
                .adminCategory(AdminCategory.builder().id(adminLogDTO.getAdminCategoryId()).build()) // Only setting ID
                .build();
    }
}
