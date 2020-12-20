package com.liwenli.sportplay.service;

import com.liwenli.sportplay.entity.User;
import org.apache.ibatis.annotations.Param;

public interface LoginService {
    public User getUserByMessage(@Param("username") String username, @Param("password") String password);//只定义接口不实现，实现交给UserMapper.xml

}
