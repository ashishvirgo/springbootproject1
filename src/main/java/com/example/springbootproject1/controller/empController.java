package com.example.springbootproject1.controller;

import com.example.springbootproject1.model.employee;
import com.example.springbootproject1.service.empService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class empController {
    @Autowired
    empService emp=null;

    @RequestMapping("/hello")
    public String hello() {
        return "Hello Ashish";
    }

    @GetMapping("/employee")
    public List<employee> getEmployees() {
        return emp.getEmployees();
    }

    @GetMapping("/employee/{eid}")
    public employee getEmployee(@PathVariable long eid) {
        return emp.getEmployee(eid);
    }
    @PostMapping("/employee")
    public employee getEmployee(@RequestBody employee emp1) {

        return emp.addEmployee(emp1);
    }
    @PutMapping("/employee")
    public employee putEmployee(@RequestBody employee emp1) {

        return emp.updateEmployee(emp1);
    }
    @DeleteMapping("/employee/{eid}")
    public employee putEmployee(@PathVariable long eid) {

        return emp.deleteEmployee(eid);
    }
}
