package edu.cqupt.d2.dao;

import edu.cqupt.d2.domain.User;

public interface UserMapper {

    User selectByPrimaryKey(String uid);

    void insertUser(User user);

    void updateUser(User user);

    void updateHeadPath(String path,String uid);
}