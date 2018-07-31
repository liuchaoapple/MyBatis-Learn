package com.xiaomudi.mybatis.mapper;

import com.xiaomudi.mybatis.bean.Employee;
import org.apache.ibatis.annotations.Select;

/**
 * @authon:刘超
 * @classname:
 * @description:
 * @date:2018/7/30 下午3:15
 */
public interface EmployeeMapperAnnotation {
    @Select("select * from tbl_employee where id =#{id}")
    public Employee getEmpById(Integer id);
}
