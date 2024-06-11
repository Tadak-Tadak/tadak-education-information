package com.web.tadak.service.teacher;

import com.web.tadak.dto.teacher.TeacherHistoryDTO;
import com.web.tadak.entity.teacher.TeacherHistory;
import com.web.tadak.mapper.TeacherMapper;
import com.web.tadak.repository.teacher.TeacherHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class TeacherHistoryServiceImpl implements TeacherHistoryService {

    @Autowired
    private TeacherHistoryRepository teacherHistoryRepository;

    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public TeacherHistoryDTO createTeacherHistory(TeacherHistoryDTO teacherHistoryDTO) {
        TeacherHistory teacherHistory = teacherMapper.toTeacherHistoryEntity(teacherHistoryDTO);
        TeacherHistory savedTeacherHistory = teacherHistoryRepository.save(teacherHistory);
        return teacherMapper.toTeacherHistoryDTO(savedTeacherHistory);
    }

    @Override
    public Optional<TeacherHistoryDTO> getTeacherHistoryById(Long id) {
        return teacherHistoryRepository.findById(id)
                .map(teacherMapper::toTeacherHistoryDTO);
    }

    @Override
    public List<TeacherHistoryDTO> getAllTeacherHistories() {
        return teacherHistoryRepository.findAll().stream()
                .map(teacherMapper::toTeacherHistoryDTO)
                .collect(Collectors.toList());
    }

    @Override
    public TeacherHistoryDTO updateTeacherHistory(Long id, TeacherHistoryDTO teacherHistoryDTO) {
        Optional<TeacherHistory> existingTeacherHistoryOpt = teacherHistoryRepository.findById(id);
        if (existingTeacherHistoryOpt.isPresent()) {
            TeacherHistory existingTeacherHistory = existingTeacherHistoryOpt.get();
            TeacherHistory updatedTeacherHistory = existingTeacherHistory.toBuilder()
                    .course(teacherMapper.toCourseEntity(teacherHistoryDTO.getCourseId())) // Only setting ID
                    .teacher(teacherMapper.toTeacherEntity(teacherHistoryDTO.getTeacherId())) // Only setting ID
                    .build();
            teacherHistoryRepository.save(updatedTeacherHistory);
            return teacherMapper.toTeacherHistoryDTO(updatedTeacherHistory);
        } else {
            // 예외 처리 (예: EntityNotFoundException)
            return null;
        }
    }

    @Override
    public void deleteTeacherHistory(Long id) {
        teacherHistoryRepository.deleteById(id);
    }
}
