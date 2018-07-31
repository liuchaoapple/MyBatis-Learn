package com.xiaomudi.mybatis.mapper;

import com.xiaomudi.mybatis.bean.Employee;

/**
 * @authon:刘超
 * @classname:
 * @description:
 * @date:2018/7/26 下午1:46
 */
public interface EmployeeMapper {
    public Employee getEmpById(Integer id);
}
