package edu.cqupt.d2.serviceimpl;

import edu.cqupt.d2.dao.DoctorMapper;
import edu.cqupt.d2.domain.Doctor;
import edu.cqupt.d2.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation = Propagation.REQUIRES_NEW)
@Service("doctorService")
public class DoctorServiceImpl implements DoctorService {
    @Autowired
    private DoctorMapper doctorMapper;

    public Doctor getDoctorByUID(String uid) {
        // TODO Auto-generated method stub
        return doctorMapper.selectByUID(uid);
    }

    @Override
    public void saveDoctor(Doctor doctor) {
        doctorMapper.InsertDoctor(doctor);
        doctorMapper.updateUserDoctor(doctor.getDoctor_ID(),doctor.getDoctor_UID());
    }

    public DoctorMapper getDoctorMapper() {
        return doctorMapper;
    }

    public void setDoctorMapper(DoctorMapper doctorMapper) {
        this.doctorMapper = doctorMapper;
    }

}