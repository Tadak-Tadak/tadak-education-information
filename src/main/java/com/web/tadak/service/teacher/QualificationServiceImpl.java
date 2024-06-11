package com.web.tadak.service.teacher;

import com.web.tadak.dto.teacher.QualificationDTO;
import com.web.tadak.entity.teacher.Qualification;
import com.web.tadak.util.mapper.TeacherMapper;
import com.web.tadak.repository.teacher.QualificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class QualificationServiceImpl implements QualificationService {

    @Autowired
    private QualificationRepository qualificationRepository;

    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public QualificationDTO createQualification(QualificationDTO qualificationDTO) {
        Qualification qualification = teacherMapper.toQualificationEntity(qualificationDTO);
        Qualification savedQualification = qualificationRepository.save(qualification);
        return teacherMapper.toQualificationDTO(savedQualification);
    }

    @Override
    public Optional<QualificationDTO> getQualificationById(Long id) {
        return qualificationRepository.findById(id)
                .map(teacherMapper::toQualificationDTO);
    }

    @Override
    public List<QualificationDTO> getAllQualifications() {
        return qualificationRepository.findAll().stream()
                .map(teacherMapper::toQualificationDTO)
                .collect(Collectors.toList());
    }

    @Override
    public QualificationDTO updateQualification(Long id, QualificationDTO qualificationDTO) {
        Optional<Qualification> existingQualificationOpt = qualificationRepository.findById(id);
        if (existingQualificationOpt.isPresent()) {
            Qualification existingQualification = existingQualificationOpt.get();
            Qualification updatedQualification = existingQualification.toBuilder()
                    .content(qualificationDTO.getContent())
                    .build();
            qualificationRepository.save(updatedQualification);
            return teacherMapper.toQualificationDTO(updatedQualification);
        } else {
            // 예외 처리 (예: EntityNotFoundException)
            return null;
        }
    }

    @Override
    public void deleteQualification(Long id) {
        qualificationRepository.deleteById(id);
    }
}
