package com.web.tadak.service.admin;

import com.web.tadak.dto.admin.AdminLogDTO;

import java.util.List;
import java.util.Optional;

public interface AdminLogService {
    AdminLogDTO createAdminLog(AdminLogDTO adminLogDTO);
    Optional<AdminLogDTO> getAdminLogById(Long id);
    List<AdminLogDTO> getAllAdminLogs();
    AdminLogDTO updateAdminLog(Long id, AdminLogDTO adminLogDTO);
    void deleteAdminLog(Long id);
}
