package com.liwenli.helloworld.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Accessors(chain = true)
public class User {
    private String id;
    private String name;
    private Integer age;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")//设置json时间格式
    private Date bir;


}
