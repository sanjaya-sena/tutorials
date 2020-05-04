package com.siyanaa.employeemasternew.repository;

import com.siyanaa.employeemasternew.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
