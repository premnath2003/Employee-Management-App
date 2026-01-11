package com.employees.demo.Repository;

import com.employees.demo.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeReps extends JpaRepository<Employee, Long> {

}
