package com.liwenli.sportplay.entity;

import org.springframework.web.bind.annotation.CrossOrigin;

/*
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

 */

//@CrossOrigin//解决跨域问题
/**
 * 创建user实体类
 */
public class User {

    private int id;//主键
    private String username;//用户名
    private String password;//密码
    private String email;//邮箱
    private String role;//角色(普通用户，管理员)
    private boolean state;//状态

//    无参构造
    public User() {

    }
//    有参构造
    public User(int id, String username, String password, String email, String role, boolean state) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
        this.state = state;
    }
//    getter方法

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }

    public boolean getState() {//idea工具生成的是isState 注意改为getState
        return state;
    }

//    setter方法


    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setState(boolean state) {
        this.state = state;
    }

//    toString方法
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", role='" + role + '\'' +
                ", state=" + state +
                '}';
    }

}
