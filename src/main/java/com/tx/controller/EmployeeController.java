package com.tx.controller;

import com.tx.bean.Employee;
import com.tx.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xt on 2018-09-21.
 */
@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;


    @GetMapping("emp1/{id}")
    public Employee emp1(@PathVariable("id") Integer id) {
        return employeeService.getEmployeeForMapper(id);
    }

    @GetMapping("emp2/{id}")
    public Employee emp2(@PathVariable("id") Integer id) {
        return employeeService.getEmployeeForRepository(id);
    }
}
