package com.web.tadak.service.teacher;

import com.web.tadak.dto.teacher.QualificationDTO;

import java.util.List;
import java.util.Optional;

public interface QualificationService {
    QualificationDTO createQualification(QualificationDTO qualificationDTO);
    Optional<QualificationDTO> getQualificationById(Long id);
    List<QualificationDTO> getAllQualifications();
    QualificationDTO updateQualification(Long id, QualificationDTO qualificationDTO);
    void deleteQualification(Long id);
}
