package com.xiaomudi.mybatis.mapper;

import com.xiaomudi.mybatis.bean.Employee;
import java.util.List;
/**
 * @authon:刘超
 * @classname:
 * @description:
 * @date:2018/7/26 下午1:46
 */
public interface EmployeeMapper {
    /**
     * 1.方法返回值：
     *  Integer
     *  Long
     *  Boolean
     *  void
     * 2.需要手动提交，见测试类
     *  或者获取可以自动提交的SqlSession
     */
    public Employee getEmpById(Integer id);
    public void addEmp(Employee employee);
    public void updateEmp(Employee employee);
    public void deleteEmp(Integer id);
    public List<Employee> list();
}
