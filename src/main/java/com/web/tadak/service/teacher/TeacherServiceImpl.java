package com.web.tadak.service.teacher;

import com.web.tadak.dto.teacher.TeacherDTO;
import com.web.tadak.entity.teacher.Teacher;
import com.web.tadak.util.mapper.TeacherMapper;
import com.web.tadak.repository.teacher.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public TeacherDTO createTeacher(TeacherDTO teacherDTO) {
        Teacher teacher = teacherMapper.toTeacherEntity(teacherDTO);
        Teacher savedTeacher = teacherRepository.save(teacher);
        return teacherMapper.toTeacherDTO(savedTeacher);
    }

    @Override
    public Optional<TeacherDTO> getTeacherById(Long id) {
        return teacherRepository.findById(id)
                .map(teacherMapper::toTeacherDTO);
    }

    @Override
    public List<TeacherDTO> getAllTeachers() {
        return teacherRepository.findAll().stream()
                .map(teacherMapper::toTeacherDTO)
                .collect(Collectors.toList());
    }

    @Override
    public TeacherDTO updateTeacher(Long id, TeacherDTO teacherDTO) {
        Optional<Teacher> existingTeacherOpt = teacherRepository.findById(id);
        if (existingTeacherOpt.isPresent()) {
            Teacher existingTeacher = existingTeacherOpt.get();
            Teacher updatedTeacher = existingTeacher.toBuilder()
                    .name(teacherDTO.getName())
                    .rating(teacherDTO.getRating())
                    .rank(teacherDTO.getRank())
                    .majorCategory(teacherMapper.toTeacherMajorCategoryEntity(teacherDTO.getMajorCategoryId())) // Only setting ID
                    .build();
            teacherRepository.save(updatedTeacher);
            return teacherMapper.toTeacherDTO(updatedTeacher);
        } else {
            // 예외 처리 (예: EntityNotFoundException)
            return null;
        }
    }

    @Override
    public void deleteTeacher(Long id) {
        teacherRepository.deleteById(id);
    }
}
