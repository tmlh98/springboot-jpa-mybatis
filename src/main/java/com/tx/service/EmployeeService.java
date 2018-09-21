package com.tx.service;

import com.tx.bean.Employee;
import com.tx.mapper.EmployeeMapper;
import com.tx.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xt on 2018-09-21.
 */
@Service
public  class EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    @Autowired
    EmployeeRepository employeeRepository;


    public Employee getEmployeeForMapper(Integer id) {
        return employeeMapper.findEmpById(id);
    }

    public Employee getEmployeeForRepository(Integer id) {
        return employeeRepository.findEmployeeById(id);
    }
}
