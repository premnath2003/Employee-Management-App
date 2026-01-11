package com.employees.demo.Mapper;

import com.employees.demo.Dto.EmployeeDto;
import com.employees.demo.Entity.Employee;

public class EmployeeMapper {

 public static EmployeeDto mapToEmployeeDto(Employee employee){
     return new EmployeeDto(
             employee.getId(),
             employee.getFirstName(),
             employee.getLastName(),
             employee.getEmail()
     );
 }

 public static Employee mapToEmployee(EmployeeDto employeeDto){
     return new Employee(
             employeeDto.getId(),
             employeeDto.getFirst(),
             employeeDto.getLastName(),
             employeeDto.getEmail()
     );
 }
}
