package com.liwenli.sportplay.mapper;

import com.liwenli.sportplay.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository//等价于@Component
public interface UserMapper {
    public User getUserByMessage(@Param("username") String username, @Param("password") String password);//只定义接口不实现，实现交给UserMapper.xml




}
