package com.liwenli.helloworld.service;

import com.liwenli.helloworld.entity.User;

import java.util.List;

public interface UserService {

    public void add(User user);

    public void update(User user);

    public void delete(String id);

    public List<User> findAll();

    public User findById(String id);

}
