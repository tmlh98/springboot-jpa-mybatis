package com.tx.repository;

import com.tx.bean.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by xt on 2018-09-21.
 */
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

    Employee findEmployeeById(Integer id);
}
