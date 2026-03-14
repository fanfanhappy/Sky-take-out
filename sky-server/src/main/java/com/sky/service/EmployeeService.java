package com.sky.service;

import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import com.sky.result.PageResult;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

    /**
     * 新增员工
     * @param employeeDTO
     */
    void save(EmployeeDTO employeeDTO);

    /**
     * 员工信息分页查询
     * @param employeePageQueryDTO
     * @return
     */
    PageResult pageQUer(EmployeePageQueryDTO employeePageQueryDTO);

    /**
     * 启用禁用员工账号
     * @param id
     * @param status
     */
    void startOrStop(Long id, Integer status);

    /**
     * 根据员工id查询信息
     * @param id
     * @return
     */
    Employee getById(Long id);

    /**
     * 修改用户信息
     * @param employeeDTO
     */
    void update(EmployeeDTO employeeDTO);
}
