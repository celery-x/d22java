package edu.cqupt.d2.dao;

import edu.cqupt.d2.domain.Hospital;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface HospitalMapper {

    Hospital selectByPrimaryKey(String id);

}