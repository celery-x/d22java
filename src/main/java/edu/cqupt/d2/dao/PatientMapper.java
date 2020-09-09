package edu.cqupt.d2.dao;

import edu.cqupt.d2.domain.Patient;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface PatientMapper {

    Patient selectByPrimaryKey(String uid);

}