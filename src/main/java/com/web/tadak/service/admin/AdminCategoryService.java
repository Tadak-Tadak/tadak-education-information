package com.web.tadak.service.admin;

import com.web.tadak.dto.admin.AdminCategoryDTO;
import com.web.tadak.entity.admin.AdminCategory;

import java.util.List;
import java.util.Optional;

//관리자 카테고리
public interface AdminCategoryService {
    AdminCategoryDTO createAdminCategory(AdminCategoryDTO adminCategoryDTO);
    Optional<AdminCategoryDTO> getAdminCategoryById(Long id);
    List<AdminCategoryDTO> getAllAdminCategories();
    AdminCategoryDTO updateAdminCategory(Long id, AdminCategoryDTO adminCategoryDTO);
    void deleteAdminCategory(Long id);
}