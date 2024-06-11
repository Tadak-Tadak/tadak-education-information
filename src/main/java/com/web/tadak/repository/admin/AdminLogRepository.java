package com.web.tadak.repository.admin;

import com.web.tadak.entity.admin.AdminLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminLogRepository extends JpaRepository<AdminLog, Long> { //관리자 행동 로그 레포지토리



}
