package com.web.tadak.service.admin;

import com.web.tadak.dto.admin.AdminToDoDTO;
import com.web.tadak.entity.admin.Admin;
import com.web.tadak.entity.admin.AdminToDo;
import com.web.tadak.repository.admin.AdminToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class AdminToDoServiceImpl implements AdminToDoService {

    @Autowired
    private AdminToDoRepository adminToDoRepository;

    @Override
    public AdminToDoDTO createAdminToDo(AdminToDoDTO adminToDoDTO) {
        AdminToDo adminToDo = dtoToEntity(adminToDoDTO);
        AdminToDo savedAdminToDo = adminToDoRepository.save(adminToDo);
        return entityToDTO(savedAdminToDo);
    }

    @Override
    public Optional<AdminToDoDTO> getAdminToDoById(Long id) {
        return adminToDoRepository.findById(id).map(this::entityToDTO);
    }

    @Override
    public List<AdminToDoDTO> getAllAdminToDos() {
        return adminToDoRepository.findAll().stream()
                .map(this::entityToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public AdminToDoDTO updateAdminToDo(Long id, AdminToDoDTO adminToDoDTO) {
        Optional<AdminToDo> existingAdminToDoOpt = adminToDoRepository.findById(id);
        if (existingAdminToDoOpt.isPresent()) {
            AdminToDo existingAdminToDo = existingAdminToDoOpt.get();
            AdminToDo updatedAdminToDo = existingAdminToDo.toBuilder()
                    .content(adminToDoDTO.getContent())
                    .isDone(adminToDoDTO.getIsDone())
                    .createdAt(adminToDoDTO.getCreatedAt())
                    .admin(Admin.builder().id(adminToDoDTO.getAdminId()).build()) // Only setting ID
                    .build();
            adminToDoRepository.save(updatedAdminToDo);
            return entityToDTO(updatedAdminToDo);
        } else {
            // 예외 처리 (예: EntityNotFoundException)
            return null;
        }
    }

    @Override
    public void deleteAdminToDo(Long id) {
        adminToDoRepository.deleteById(id);
    }

    private AdminToDoDTO entityToDTO(AdminToDo adminToDo) {
        return AdminToDoDTO.builder()
                .id(adminToDo.getId())
                .content(adminToDo.getContent())
                .isDone(adminToDo.getIsDone())
                .createdAt(adminToDo.getCreatedAt())
                .adminId(adminToDo.getAdmin() != null ? adminToDo.getAdmin().getId() : null) // Null check
                .build();
    }

    private AdminToDo dtoToEntity(AdminToDoDTO adminToDoDTO) {
        return AdminToDo.builder()
                .id(adminToDoDTO.getId())
                .content(adminToDoDTO.getContent())
                .isDone(adminToDoDTO.getIsDone())
                .createdAt(adminToDoDTO.getCreatedAt() != null ? adminToDoDTO.getCreatedAt() : LocalDateTime.now())
                .admin(Admin.builder().id(adminToDoDTO.getAdminId()).build()) // Only setting ID
                .build();
    }
}
