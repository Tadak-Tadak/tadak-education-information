package com.web.tadak.service.institution;

import com.web.tadak.dto.institution.CertifiedInstitutionDTO;
import com.web.tadak.entity.institution.CertifiedInstitution;
import com.web.tadak.util.mapper.InstitutionMapper;
import com.web.tadak.repository.institution.CertifiedInstitutionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class CertifiedInstitutionServiceImpl implements CertifiedInstitutionService {

    @Autowired
    private CertifiedInstitutionRepository certifiedInstitutionRepository;

    @Autowired
    private InstitutionMapper institutionMapper;

    @Override
    public CertifiedInstitutionDTO createCertifiedInstitution(CertifiedInstitutionDTO certifiedInstitutionDTO) {
        CertifiedInstitution certifiedInstitution = institutionMapper.toCertifiedInstitutionEntity(certifiedInstitutionDTO);
        CertifiedInstitution savedCertifiedInstitution = certifiedInstitutionRepository.save(certifiedInstitution);
        return institutionMapper.toCertifiedInstitutionDTO(savedCertifiedInstitution);
    }

    @Override
    public Optional<CertifiedInstitutionDTO> getCertifiedInstitutionById(Long id) {
        return certifiedInstitutionRepository.findById(id)
                .map(institutionMapper::toCertifiedInstitutionDTO);
    }

    @Override
    public List<CertifiedInstitutionDTO> getAllCertifiedInstitutions() {
        return certifiedInstitutionRepository.findAll().stream()
                .map(institutionMapper::toCertifiedInstitutionDTO)
                .collect(Collectors.toList());
    }

    @Override
    public CertifiedInstitutionDTO updateCertifiedInstitution(Long id, CertifiedInstitutionDTO certifiedInstitutionDTO) {
        Optional<CertifiedInstitution> existingCertifiedInstitutionOpt = certifiedInstitutionRepository.findById(id);
        if (existingCertifiedInstitutionOpt.isPresent()) {
            CertifiedInstitution existingCertifiedInstitution = existingCertifiedInstitutionOpt.get();
            CertifiedInstitution updatedCertifiedInstitution = existingCertifiedInstitution.toBuilder()
                    .certifiedInstitutionType(certifiedInstitutionDTO.getCertifiedInstitutionType())
                    .certifiedIntro(certifiedInstitutionDTO.getCertifiedIntro())
                    .build();
            certifiedInstitutionRepository.save(updatedCertifiedInstitution);
            return institutionMapper.toCertifiedInstitutionDTO(updatedCertifiedInstitution);
        } else {
            // 예외 처리 (예: EntityNotFoundException)
            return null;
        }
    }

    @Override
    public void deleteCertifiedInstitution(Long id) {
        certifiedInstitutionRepository.deleteById(id);
    }
}
