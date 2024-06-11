package com.web.tadak.service.admin;

import com.web.tadak.dto.admin.AdminDTO;
import com.web.tadak.entity.admin.Admin;
import com.web.tadak.repository.admin.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public AdminDTO createAdmin(AdminDTO adminDTO) {
        Admin admin = dtoToEntity(adminDTO);
        admin = admin.toBuilder()  // toBuilder를 사용하여 새로운 객체를 빌드
                .createdAt(LocalDateTime.now()) // 생성일자 설정
                .build();
        Admin savedAdmin = adminRepository.save(admin);
        return entityToDTO(savedAdmin);
    }

    @Override
    public Optional<AdminDTO> getAdminById(Long id) {
        return adminRepository.findById(id).map(this::entityToDTO);
    }

    @Override
    public Optional<AdminDTO> getAdminByAdminId(String adminId) {
        return adminRepository.findByAdminId(adminId).map(this::entityToDTO);
    }

    @Override
    public List<AdminDTO> getAllAdmins() {
        return adminRepository.findAll().stream().map(this::entityToDTO).collect(Collectors.toList());
    }

    @Override
    public AdminDTO updateAdmin(Long id, AdminDTO adminDTO) {
        Optional<Admin> existingAdminOpt = adminRepository.findById(id);
        if (existingAdminOpt.isPresent()) {
            Admin existingAdmin = existingAdminOpt.get();
            Admin updatedAdmin = existingAdmin.toBuilder()
                    .adminId(adminDTO.getAdminId())
                    .adminPw(adminDTO.getAdminPw())
                    .name(adminDTO.getName())
                    .tel(adminDTO.getTel())
                    .email(adminDTO.getEmail())
                    .imgUrl(adminDTO.getImgUrl())
                    .build();
            adminRepository.save(updatedAdmin);
            return entityToDTO(updatedAdmin);
        } else {
            // 예외 처리 (예: EntityNotFoundException)
            return null;
        }
    }

    @Override
    public void deleteAdmin(Long id) {
        adminRepository.deleteById(id);
    }

    private AdminDTO entityToDTO(Admin admin) {
        return AdminDTO.builder()
                .id(admin.getId())
                .adminId(admin.getAdminId())
                .adminPw(admin.getAdminPw())
                .name(admin.getName())
                .createdAt(admin.getCreatedAt())
                .tel(admin.getTel())
                .email(admin.getEmail())
                .imgUrl(admin.getImgUrl())
                .build();
    }

    private Admin dtoToEntity(AdminDTO adminDTO) {
        return Admin.builder()
                .id(adminDTO.getId())
                .adminId(adminDTO.getAdminId())
                .adminPw(adminDTO.getAdminPw())
                .name(adminDTO.getName())
                .createdAt(adminDTO.getCreatedAt() != null ? adminDTO.getCreatedAt() : LocalDateTime.now())
                .tel(adminDTO.getTel())
                .email(adminDTO.getEmail())
                .imgUrl(adminDTO.getImgUrl())
                .build();
    }
}
