package com.liwenli.sportplay.controller;

import com.alibaba.fastjson.JSON;
import com.liwenli.sportplay.entity.User;
import com.liwenli.sportplay.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping("/login")
    public String login(@RequestBody User user) {//@RequestBody是必要的，这样后端才能读取到前端传递到后端的用户名和密码信息，假如没有该注解，则前端登录时的发送请求的用户名和密码将无法被后端读取到，即后端控制台将会出现User{id=1, username='null', password='null', email='null', role='null', state=null}
//      不返回String 而直接返回Map集合也是可以的，假如返回Map集合则不需要转换为json字符串对象
        User userMessage = loginService.getUserByMessage(user.getUsername(), user.getPassword());

/**
 * 返回结果的json封装！！
 */
//        return "ok";//返回的json数据给前端/login页面，用于前端login用户登录校验，但是我们不使用这种方式，我们通常将字符串形式转换为 json对象字符串给前端页面

//        1.定义一个res容器，用来存放需要转换为json字符串对象,定义一个msg表示返回的信息

        String msg = "error";
        Map<String, Object> res = new HashMap<>();
//        2.将要返回的字符串 msg="ok"装入到一个map容器中
        if (userMessage != null) {
            msg = "ok";
        }
        res.put("msg", msg);
        res.put("userMessage", userMessage);
//        注意：String res_json = JSON.toJSONString("res"); ("res")是错误的！！！res是一个对象！！不是字符串！！
        String res_json = JSON.toJSONString(res);//fastjson的方法！
        System.out.println("userMessage:" + userMessage);

        return res_json;


    }
}
