package edu.cqupt.d2.dao;

import edu.cqupt.d2.domain.Third;
import org.apache.ibatis.annotations.Mapper;


import java.util.Map;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ThirdMapper {

    Third selectByPrimaryKey(String tid);

    Third selectByUID(String uid);

    void InsertThird(Third third);

    void updateUserThird(String thirdID,String UID);
}