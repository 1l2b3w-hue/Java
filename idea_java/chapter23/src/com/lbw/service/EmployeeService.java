package com.lbw.service;

import com.lbw.dao_.EmployeeDAO;
import com.lbw.domain_.Employee;
import org.junit.jupiter.api.Test;

// 实现对 employee 表的相关操作，通过调用 employeeDAO 实现
public class EmployeeService {
    private EmployeeDAO employeeDAO = new EmployeeDAO();

    // 实现根据 empId 和 pwd 返回一个 employee 对象
    // 查到返回对象，没有查到返回一个null
    public Employee getEmployeeByEmpIdAndPwd(String empId,String pwd) {
        String sql = "select * from employee where empId = ? and pwd = md5(?)";
        return employeeDAO.selectSingle(sql, Employee.class, empId, pwd);

    }



}
