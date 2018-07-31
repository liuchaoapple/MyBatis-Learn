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
@RequiredArgsConstructor
@Setter
@Getter
@ToString
@Alias("emp")
public class Employee {
    private Integer id;
    @NonNull private String lastName;
    @NonNull private String email;
    @NonNull private String gender;
}
