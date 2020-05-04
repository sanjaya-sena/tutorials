package com.siyanaa.employeemasternew;

import com.siyanaa.employeemasternew.entity.Employee;
import com.siyanaa.employeemasternew.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class EmployeemasternewApplication {

    @Autowired
    EmployeeRepository employeeRepository;

    public static void main(String[] args) {
        SpringApplication.run(EmployeemasternewApplication.class, args);
    }

    @PostConstruct
    private void initData(){
        Employee employee1 = new Employee();
        employee1.setFirstName("Sanjaya");
        employee1.setLastName("Senadheera");

        employeeRepository.save(employee1);

        Employee employee2 = new Employee();
        employee2.setFirstName("Dananjaya");
        employee2.setLastName("Senadheera");

        employeeRepository.save(employee2);
    }
}
