package com.web.tadak.util.mapper;

import com.web.tadak.dto.teacher.QualificationDTO;
import com.web.tadak.dto.teacher.TeacherDTO;
import com.web.tadak.dto.teacher.TeacherHistoryDTO;
import com.web.tadak.entity.teacher.Qualification;
import com.web.tadak.entity.teacher.Teacher;
import com.web.tadak.entity.teacher.TeacherHistory;
import com.web.tadak.entity.teacher.TeacherMajorCategory;
import org.springframework.stereotype.Component;

@Component
public class TeacherMapper {

    // Convert Qualification entity to DTO
    public QualificationDTO toQualificationDTO(Qualification qualification) {
        if (qualification == null) {
            return null;
        }
        return QualificationDTO.builder()
                .id(qualification.getId())
                .content(qualification.getContent())
                .build();
    }

    // Convert Qualification DTO to entity
    public Qualification toQualificationEntity(QualificationDTO qualificationDTO) {
        if (qualificationDTO == null) {
            return null;
        }
        return Qualification.builder()
                .id(qualificationDTO.getId())
                .content(qualificationDTO.getContent())
                .build();
    }

    // Convert Teacher entity to DTO
    public TeacherDTO toTeacherDTO(Teacher teacher) {
        if (teacher == null) {
            return null;
        }
        return TeacherDTO.builder()
                .id(teacher.getId())
                .name(teacher.getName())
                .rating(teacher.getRating())
                .rank(teacher.getRank())
                .majorCategoryId(teacher.getMajorCategory() != null ? teacher.getMajorCategory().getId() : null)
                .build();
    }

    // Convert Teacher DTO to entity
    public Teacher toTeacherEntity(TeacherDTO teacherDTO) {
        if (teacherDTO == null) {
            return null;
        }
        return Teacher.builder()
                .id(teacherDTO.getId())
                .name(teacherDTO.getName())
                .rating(teacherDTO.getRating())
                .rank(teacherDTO.getRank())
                .majorCategory(teacherDTO.getMajorCategoryId() != null ? TeacherMajorCategory.builder().id(teacherDTO.getMajorCategoryId()).build() : null)
                .build();
    }

    // Convert ID to TeacherMajorCategory entity
    public TeacherMajorCategory toTeacherMajorCategoryEntity(Long majorCategoryId) {
        return majorCategoryId != null ? TeacherMajorCategory.builder().id(majorCategoryId).build() : null;
    }

    // Convert TeacherHistory entity to DTO
    public TeacherHistoryDTO toTeacherHistoryDTO(TeacherHistory teacherHistory) {
        if (teacherHistory == null) {
            return null;
        }
        return TeacherHistoryDTO.builder()
                .id(teacherHistory.getId())
                .courseId(teacherHistory.getCourse() != null ? teacherHistory.getCourse().getId() : null)
                .teacherId(teacherHistory.getTeacher() != null ? teacherHistory.getTeacher().getId() : null)
                .build();
    }

    // Convert TeacherHistory DTO to entity
    public TeacherHistory toTeacherHistoryEntity(TeacherHistoryDTO teacherHistoryDTO) {
        if (teacherHistoryDTO == null) {
            return null;
        }
        return TeacherHistory.builder()
                .id(teacherHistoryDTO.getId())
                .course(teacherHistoryDTO.getCourseId() != null ? Course.builder().id(teacherHistoryDTO.getCourseId()).build() : null)
                .teacher(teacherHistoryDTO.getTeacherId() != null ? Teacher.builder().id(teacherHistoryDTO.getTeacherId()).build() : null)
                .build();
    }


}
