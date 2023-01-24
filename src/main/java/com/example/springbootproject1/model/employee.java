package com.example.springbootproject1.model;

import org.springframework.context.annotation.Bean;


public class employee {
    private long eId;
    private String eName;
    private long salary;
    public employee() {

    }
    public employee(long eId, String eName, long salary) {
        this.eId = eId;
        this.eName = eName;
        this.salary = salary;
    }

    public long geteId() {
        return eId;
    }

    public void seteId(long eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}
