package com.web.tadak.service.teacher;

import com.web.tadak.dto.teacher.TeacherHistoryDTO;

import java.util.List;
import java.util.Optional;

public interface TeacherHistoryService {
    TeacherHistoryDTO createTeacherHistory(TeacherHistoryDTO teacherHistoryDTO);
    Optional<TeacherHistoryDTO> getTeacherHistoryById(Long id);
    List<TeacherHistoryDTO> getAllTeacherHistories();
    TeacherHistoryDTO updateTeacherHistory(Long id, TeacherHistoryDTO teacherHistoryDTO);
    void deleteTeacherHistory(Long id);
}
