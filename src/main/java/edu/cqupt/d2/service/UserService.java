package edu.cqupt.d2.service;

import edu.cqupt.d2.domain.User;

public interface UserService {
    public User getUserById(String id);

    public void saveUser(User user);

    public void alterUser(User user);
}