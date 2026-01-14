package com.pm.patientservice.service;

import com.pm.patientservice.dto.PatientRequestDTO;
import com.pm.patientservice.dto.PatientResponseDTO;

import java.util.List;

public interface PatientService {
    public List<PatientResponseDTO> getPatients();

    public PatientResponseDTO createPatient(PatientRequestDTO patientRequestDTO);
}
