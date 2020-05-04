package com.siyanaa.employeemasternew.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    @GetMapping("/employee")
    public String viewIndexPage(){
        return "index";
    }

    @GetMapping("/employee/create")
    public String viewCreatePage(){
        return "create";
    }
}
