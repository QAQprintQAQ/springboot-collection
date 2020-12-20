package com.liwenli.helloworld.mapper;

import com.liwenli.helloworld.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    public void add(User user);

    public void update(User user);

    public void delete(String id);

    public List<User> findAll();

    public User findById(String id);


}
