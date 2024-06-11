package com.web.tadak.service.admin;

import com.web.tadak.dto.admin.AdminDTO;

import java.util.List;
import java.util.Optional;

public interface AdminService {
    AdminDTO createAdmin(AdminDTO adminDTO);
    Optional<AdminDTO> getAdminById(Long id);
    Optional<AdminDTO> getAdminByAdminId(String adminId);
    List<AdminDTO> getAllAdmins();
    AdminDTO updateAdmin(Long id, AdminDTO adminDTO);
    void deleteAdmin(Long id);
}