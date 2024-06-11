package com.web.tadak.service.teacher;

import com.web.tadak.dto.teacher.TeacherDTO;

import java.util.List;
import java.util.Optional;

public interface TeacherService {
    TeacherDTO createTeacher(TeacherDTO teacherDTO);
    Optional<TeacherDTO> getTeacherById(Long id);
    List<TeacherDTO> getAllTeachers();
    TeacherDTO updateTeacher(Long id, TeacherDTO teacherDTO);
    void deleteTeacher(Long id);
}
