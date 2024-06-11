package com.web.tadak.service.admin;

import com.web.tadak.dto.admin.AdminToDoDTO;
import com.web.tadak.entity.admin.AdminToDo;
import com.web.tadak.util.mapper.AdminMapper;
import com.web.tadak.repository.admin.AdminToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class AdminToDoServiceImpl implements AdminToDoService {

    @Autowired
    private AdminToDoRepository adminToDoRepository;

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public AdminToDoDTO createAdminToDo(AdminToDoDTO adminToDoDTO) {
        AdminToDo adminToDo = adminMapper.toAdminToDoEntity(adminToDoDTO);
        AdminToDo savedAdminToDo = adminToDoRepository.save(adminToDo);
        return adminMapper.toAdminToDoDTO(savedAdminToDo);
    }

    @Override
    public Optional<AdminToDoDTO> getAdminToDoById(Long id) {
        return adminToDoRepository.findById(id).map(adminMapper::toAdminToDoDTO);
    }

    @Override
    public List<AdminToDoDTO> getAllAdminToDos() {
        return adminToDoRepository.findAll().stream()
                .map(adminMapper::toAdminToDoDTO)
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
                    .admin(adminMapper.toAdminEntity(adminToDoDTO.getAdminId())) // Only setting ID
                    .build();
            adminToDoRepository.save(updatedAdminToDo);
            return adminMapper.toAdminToDoDTO(updatedAdminToDo);
        } else {
            // 예외 처리 (예: EntityNotFoundException)
            return null;
        }
    }

    @Override
    public void deleteAdminToDo(Long id) {
        adminToDoRepository.deleteById(id);
    }
}
