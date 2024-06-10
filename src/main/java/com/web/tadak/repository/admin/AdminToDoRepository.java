package com.web.tadak.repository.admin;

import com.web.tadak.entity.admin.AdminToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminToDoRepository extends JpaRepository<AdminToDo, Long> {
}
