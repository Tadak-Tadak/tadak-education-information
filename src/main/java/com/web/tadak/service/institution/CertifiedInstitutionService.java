package com.web.tadak.service.institution;

import com.web.tadak.dto.institution.CertifiedInstitutionDTO;

import java.util.List;
import java.util.Optional;

public interface CertifiedInstitutionService {
    CertifiedInstitutionDTO createCertifiedInstitution(CertifiedInstitutionDTO certifiedInstitutionDTO);
    Optional<CertifiedInstitutionDTO> getCertifiedInstitutionById(Long id);
    List<CertifiedInstitutionDTO> getAllCertifiedInstitutions();
    CertifiedInstitutionDTO updateCertifiedInstitution(Long id, CertifiedInstitutionDTO certifiedInstitutionDTO);
    void deleteCertifiedInstitution(Long id);
}
