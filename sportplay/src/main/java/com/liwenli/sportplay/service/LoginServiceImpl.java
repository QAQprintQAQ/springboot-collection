package com.liwenli.sportplay.service;

import com.liwenli.sportplay.entity.User;
import com.liwenli.sportplay.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LoginServiceImpl implements LoginService {

    @Autowired
    UserMapper userMapper;
    @Override
    public User getUserByMessage(String username, String password) {
        return userMapper.getUserByMessage(username,password);

    }

}
