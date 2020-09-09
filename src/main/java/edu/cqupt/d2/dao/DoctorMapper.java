package edu.cqupt.d2.dao;

import edu.cqupt.d2.domain.Doctor;
import edu.cqupt.d2.domain.Third;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository

@Mapper
public interface DoctorMapper {

    Doctor selectByUID(String uid);

    void InsertDoctor(Doctor doctor);

    void updateUserDoctor(String a,String b);

}