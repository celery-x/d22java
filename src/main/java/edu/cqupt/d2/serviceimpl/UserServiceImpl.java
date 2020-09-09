package edu.cqupt.d2.serviceimpl;

import edu.cqupt.d2.dao.UserMapper;
import edu.cqupt.d2.domain.User;
import edu.cqupt.d2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public User getUserById(String id) {
        // TODO Auto-generated method stub
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public void saveUser(User user) {
        userMapper.insertUser(user);
    }

    @Override
    public void alterUser(User user) {
        userMapper.updateUser(user);
    }

    @Override
    public void setHead(String uid, String path) {
        userMapper.updateHeadPath(path,uid);
    }


    public UserMapper getUserMapper() {
        return userMapper;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

}