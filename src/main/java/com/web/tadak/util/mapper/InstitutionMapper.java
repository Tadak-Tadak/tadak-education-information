package com.web.tadak.util.mapper;

import com.web.tadak.dto.institution.CertifiedInstitutionDTO;
import com.web.tadak.entity.institution.CertifiedInstitution;
import org.springframework.stereotype.Component;

@Component
public class InstitutionMapper {

    // Convert CertifiedInstitution entity to DTO
    public CertifiedInstitutionDTO toCertifiedInstitutionDTO(CertifiedInstitution certifiedInstitution) {
        if (certifiedInstitution == null) {
            return null;
        }
        return CertifiedInstitutionDTO.builder()
                .id(certifiedInstitution.getId())
                .certifiedInstitutionType(certifiedInstitution.getCertifiedInstitutionType())
                .certifiedIntro(certifiedInstitution.getCertifiedIntro())
                .build();
    }

    // Convert CertifiedInstitution DTO to entity
    public CertifiedInstitution toCertifiedInstitutionEntity(CertifiedInstitutionDTO certifiedInstitutionDTO) {
        if (certifiedInstitutionDTO == null) {
            return null;
        }
        return CertifiedInstitution.builder()
                .id(certifiedInstitutionDTO.getId())
                .certifiedInstitutionType(certifiedInstitutionDTO.getCertifiedInstitutionType())
                .certifiedIntro(certifiedInstitutionDTO.getCertifiedIntro())
                .build();
    }
}
