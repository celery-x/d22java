package edu.cqupt.d2.service;

import edu.cqupt.d2.domain.Doctor;
import edu.cqupt.d2.domain.Third;

public interface DoctorService {
    public Doctor getDoctorByUID(String uid);

    public void saveDoctor(Doctor doctor);

}