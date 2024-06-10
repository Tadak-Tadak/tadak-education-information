package com.web.tadak.repository.admin;

import com.web.tadak.entity.admin.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> { //관리자 레포지토리
    Optional<Admin> findByAdminId(String adminId); // 관리자의 ID로 검색하는 메서드 추가
}