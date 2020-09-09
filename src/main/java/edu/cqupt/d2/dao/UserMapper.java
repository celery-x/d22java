package edu.cqupt.d2.dao;

import edu.cqupt.d2.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {

    User selectByPrimaryKey(String uid);

    void insertUser(User user);

    void updateUser(User user);
}