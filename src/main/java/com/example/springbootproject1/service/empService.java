package com.example.springbootproject1.service;

import com.example.springbootproject1.model.employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class empService {
    List<employee> employeeList=null;

    public empService() {
        employeeList=new ArrayList<>();
        employeeList.add(new employee(1,"Ankur",55000));
        employeeList.add(new employee(2,"Vipin",65000));
        employeeList.add(new employee(3,"Naveen",75000));
    }

    public List<employee> getEmployees(){
          return employeeList;
    }
    public employee getEmployee(long eid){
        employee e = null;
        for (employee ee:employeeList) {
            if(ee.geteId()==eid){
                e=ee;
                break;
            }
        }
        return e;
    }

}
