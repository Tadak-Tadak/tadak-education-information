package com.web.tadak.repository.admin;

import com.web.tadak.entity.admin.AdminCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminCategoryRepository extends JpaRepository<AdminCategory, Long> { //관리자 카테고리 연결용 레포지토리
}
