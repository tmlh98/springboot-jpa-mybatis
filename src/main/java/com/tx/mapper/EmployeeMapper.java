package com.tx.mapper;

import com.tx.bean.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by xt on 2018-09-21.
 */

@Mapper
public interface EmployeeMapper {

    @Select("select * from employee where id = #{id}")
    Employee findEmpById(Integer id);
}
