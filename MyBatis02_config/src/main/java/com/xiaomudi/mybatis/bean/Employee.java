package com.xiaomudi.mybatis.bean;


import lombok.*;
import org.apache.ibatis.type.Alias;

/**
 * @authon:刘超
 * @classname:
 * @description:
 * @date:2018/7/26 下午1:24
 */
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Alias("emp")
public class Employee {
    private Integer id;
    private String lastName;
    private String email;
    private String gender;
}
