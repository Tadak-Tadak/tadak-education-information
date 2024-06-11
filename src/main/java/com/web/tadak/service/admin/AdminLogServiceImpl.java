package com.web.tadak.service.admin;

import com.web.tadak.dto.admin.AdminLogDTO;
import com.web.tadak.entity.admin.AdminLog;
import com.web.tadak.util.mapper.AdminMapper;
import com.web.tadak.repository.admin.AdminLogRepository;
import com.web.tadak.util.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class AdminLogServiceImpl implements AdminLogService { //관리자 행동 로그

    @Autowired
    private AdminLogRepository adminLogRepository;

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public AdminLogDTO createAdminLog(AdminLogDTO adminLogDTO) { 
        AdminLog adminLog = adminMapper.toAdminLogEntity(adminLogDTO);
        AdminLog savedAdminLog = adminLogRepository.save(adminLog);
        return adminMapper.toAdminLogDTO(savedAdminLog);
    }

    @Override
    public Optional<AdminLogDTO> getAdminLogById(Long id) {
        return adminLogRepository.findById(id).map(adminMapper::toAdminLogDTO);
    }

    @Override
    public List<AdminLogDTO> getAllAdminLogs() {
        return adminLogRepository.findAll().stream()
                .map(adminMapper::toAdminLogDTO)
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
                    .admin(adminMapper.toAdminEntity(adminLogDTO.getAdminId())) // Only setting ID
                    .adminCategory(adminMapper.toAdminCategoryEntity(adminLogDTO.getAdminCategoryId())) // Only setting ID
                    .build();
            adminLogRepository.save(updatedAdminLog);
            return adminMapper.toAdminLogDTO(updatedAdminLog);
        } else {
            // 예외 처리 (예: EntityNotFoundException)
            return null;
        }
    }

    @Override
    public void deleteAdminLog(Long id) {
        adminLogRepository.deleteById(id);
    }
}
