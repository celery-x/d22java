package edu.cqupt.d2.dao;

import edu.cqupt.d2.domain.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface AdminMapper {

    Admin selectByPrimaryKey(String uid);

}