package com.employees.demo.Service;

import com.employees.demo.Dto.EmployeeDto;
import com.employees.demo.Entity.Employee;
import com.employees.demo.Exception.ResourceNotFoundException;
import com.employees.demo.Mapper.EmployeeMapper;
import com.employees.demo.Repository.EmployeeReps;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.awt.image.RasterFormatException;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeReps employeeReps;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee createEmployee = employeeReps.save(employee);
        return EmployeeMapper.mapToEmployeeDto(createEmployee);
    }

    @Override
    public EmployeeDto getEmployeeByID(Long employeeId) {
        Employee employee = employeeReps.findById(employeeId)
                .orElseThrow(()-> new RasterFormatException("Employee is not exists with given Id:"+ employeeId));
        return EmployeeMapper.mapToEmployeeDto(employee);
    }

    @Override
    public List<EmployeeDto> getAllEmployees() {
        List<Employee> employees = employeeReps.findAll();
        return employees.stream().map((employee) -> EmployeeMapper.mapToEmployeeDto(employee)).collect(Collectors.toList());
    }

    @Override
    public EmployeeDto updateEmployee(Long employeeId, EmployeeDto updateEmployee) {
        Employee employee = employeeReps.findById(employeeId).orElseThrow(
                ()-> new ResourceNotFoundException("Employee in not exists with given Id: " +employeeId));
        employee.setFirstName(updateEmployee.getFirstName());
        employee.setLastName(updateEmployee.getLastName());
        employee.setEmail(updateEmployee.getEmail());
        Employee updatedEmployee = employeeReps.save(employee);
        return EmployeeMapper.mapToEmployeeDto(updatedEmployee);
    }

    @Override
    public void deleteEmployee(Long employeeId) {
        Employee employee = employeeReps.findById(employeeId).orElseThrow(
                ()-> new ResourceNotFoundException("Employee in not exists with given Id: " +employeeId));
        employeeReps.deleteById(employeeId);
    }
}
