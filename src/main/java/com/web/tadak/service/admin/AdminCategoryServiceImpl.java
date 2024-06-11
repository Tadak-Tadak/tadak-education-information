package com.web.tadak.service.admin;

import com.web.tadak.dto.admin.AdminCategoryDTO;
import com.web.tadak.entity.admin.AdminCategory;
import com.web.tadak.repository.admin.AdminCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class AdminCategoryServiceImpl implements AdminCategoryService {

    @Autowired
    private AdminCategoryRepository adminCategoryRepository;

    @Override
    public AdminCategoryDTO createAdminCategory(AdminCategoryDTO adminCategoryDTO) {
        AdminCategory adminCategory = dtoToEntity(adminCategoryDTO);
        AdminCategory savedAdminCategory = adminCategoryRepository.save(adminCategory);
        return entityToDTO(savedAdminCategory);
    }

    @Override
    public Optional<AdminCategoryDTO> getAdminCategoryById(Long id) {
        return adminCategoryRepository.findById(id).map(this::entityToDTO);
    }

    @Override
    public List<AdminCategoryDTO> getAllAdminCategories() {
        return adminCategoryRepository.findAll().stream()
                .map(this::entityToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public AdminCategoryDTO updateAdminCategory(Long id, AdminCategoryDTO adminCategoryDTO) {
        Optional<AdminCategory> existingAdminCategoryOpt = adminCategoryRepository.findById(id);
        if (existingAdminCategoryOpt.isPresent()) {
            AdminCategory existingAdminCategory = existingAdminCategoryOpt.get();
            AdminCategory updatedAdminCategory = existingAdminCategory.toBuilder()
                    .content(adminCategoryDTO.getContent())
                    .build();
            adminCategoryRepository.save(updatedAdminCategory);
            return entityToDTO(updatedAdminCategory);
        } else {
            // 예외 처리 (예: EntityNotFoundException)
            return null;
        }
    }

    @Override
    public void deleteAdminCategory(Long id) {
        adminCategoryRepository.deleteById(id);
    }

    private AdminCategoryDTO entityToDTO(AdminCategory adminCategory) {
        return AdminCategoryDTO.builder()
                .id(adminCategory.getId())
                .content(adminCategory.getContent())
                .build();
    }

    private AdminCategory dtoToEntity(AdminCategoryDTO adminCategoryDTO) {
        return AdminCategory.builder()
                .id(adminCategoryDTO.getId())
                .content(adminCategoryDTO.getContent())
                .build();
    }
}
