package com.sky.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class EmployeeDTO implements Serializable {

    //员工ID
    private Long id;

    //员工用户名
    private String username;

    //用户名
    private String name;

    private String phone;

    private String sex;

    private String idNumber;

}
