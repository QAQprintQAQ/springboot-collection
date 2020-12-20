package com.liwenli.helloworld.controller;

import com.liwenli.helloworld.entity.User;
import com.liwenli.helloworld.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")//解决跨域问题
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 添加用户信息
     * @param user
     * @return
     */
    @PostMapping("userAdd")
    public Map<Object, Object> userAdd(@RequestBody User user) {
        Map<Object, Object> map = new HashMap<>();
        try {
            userService.add(user);
            map.put("success", true);
            map.put("msg", "添加成功");

        } catch (Exception e) {
            e.printStackTrace();
            map.put("success", false);
            map.put("msg", "添加失败" + e.getMessage());
        }
        return map;

    }


    /**
     * 查询所有用户信息
     * @param page
     * @param rows
     * @return
     */
    @GetMapping("findAll")
    public Map<String, Object> findAll(Integer page, Integer rows) {

        Map<String,Object> map = new HashMap<>();
        List<User> results = userService.findAll();
        map.put("total", 10);
        map.put("rows", 1);
        map.put("page", page);
        map.put("results", results);
        return map;

    }


    /**
     * 删除用户信息
     * @param id
     * @return
     */

    @GetMapping("userDel")
    public Map<Object, Object> userDel(String id) {
        Map<Object, Object> map = new HashMap<>();
        try {
            userService.delete(id);
            map.put("success", true);
            map.put("msg", "删除成功");

        } catch (Exception e) {
            e.printStackTrace();
            map.put("success", false);
            map.put("msg", "删除失败" + e.getMessage());
        }
        return map;

    }


    /**
     * 查看一个人的信息
     * @param id
     * @return
     */
    @GetMapping("findOne")
    public User findOne(String id) {
        return userService.findById(id);
    }


    @PostMapping("updateUserInfo")
    public Map<Object, Object> updateUserInfo(@RequestBody User user) {
        Map<Object, Object> map = new HashMap<>();
        try {
            userService.update(user);
            map.put("success", true);
            map.put("msg", "更新成功");

        } catch (Exception e) {
            e.printStackTrace();
            map.put("success", false);
            map.put("msg", "更新失败" + e.getMessage());
        }
        return map;

    }



}
