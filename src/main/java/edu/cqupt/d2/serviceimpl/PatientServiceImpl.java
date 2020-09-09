package edu.cqupt.d2.serviceimpl;

import edu.cqupt.d2.dao.PatientMapper;
import edu.cqupt.d2.domain.Patient;
import edu.cqupt.d2.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("patientService")
public class PatientServiceImpl implements PatientService {
    @Autowired
    private PatientMapper patientMapper;

    public Patient getPatientById(String id) {
        // TODO Auto-generated method stub
        return patientMapper.selectByPrimaryKey(id);
    }

    public PatientMapper getPatientMapper() {
        return patientMapper;
    }

    public void setPatientMapper(PatientMapper patientMapper) {
        this.patientMapper = patientMapper;
    }

}