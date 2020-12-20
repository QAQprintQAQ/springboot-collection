package com.liwenli.sportplay;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.liwenli.sportplay.mapper")//使用该注解，可以免去每个Mapper类都加上@Mapper
@SpringBootApplication
public class SportPlayApplication {
    public static void main(String[] args) {
        SpringApplication.run(SportPlayApplication.class,args);


    }
}
