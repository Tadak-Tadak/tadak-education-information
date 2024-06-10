package com.web.tadak.service.admin;

import com.web.tadak.dto.admin.AdminToDoDTO;

import java.util.List;
import java.util.Optional;

public interface AdminToDoService {
    AdminToDoDTO createAdminToDo(AdminToDoDTO adminToDoDTO);
    Optional<AdminToDoDTO> getAdminToDoById(Long id);
    List<AdminToDoDTO> getAllAdminToDos();
    AdminToDoDTO updateAdminToDo(Long id, AdminToDoDTO adminToDoDTO);
    void deleteAdminToDo(Long id);
}
