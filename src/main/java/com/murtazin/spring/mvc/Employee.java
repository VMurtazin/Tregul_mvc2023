package com.murtazin.spring.mvc;



import com.murtazin.spring.mvc.validation.CheckEmail;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {

    @Size(min = 2, message = "Minimum 2")
    private String name;
    @NotBlank(message = "Zapolni pole")
    private String surname;
    @Max(value = 1000, message = "must be between 200 and 1000")
    @Min(value = 200, message = "must be between 200 and 1000")
    private int salary;
    private String department;
    private Map<String,String> departments;
    private String CarBrend;
    private String[]langs;
    @CheckEmail
    private String email;

    public Employee() {
        departments =new HashMap<>();
        departments.put("IT","Information Technology");
        departments.put("HR","Human Resources");
        departments.put("SU","Station University");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getCarBrend() {
        return CarBrend;
    }

    public void setCarBrend(String carBrend) {
        CarBrend = carBrend;
    }

    public String[] getLangs() {
        return langs;
    }

    public void setLangs(String[] langs) {
        this.langs = langs;
    }
}
