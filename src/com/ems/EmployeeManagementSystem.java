package com.ems;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem {
    private List<Employee> employees;

    public EmployeeManagementSystem() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void listEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem();

        Employee e1 = new Employee(1, "John Doe", 50000);
        Manager m1 = new Manager(2, "Jane Smith", 70000, 10000);
        HR hr1 = new HR(3, "Bob Brown", 60000, 15);

        system.addEmployee(e1);
        system.addEmployee(m1);
        system.addEmployee(hr1);

        System.out.println("Employee List:");
        system.listEmployees();
    }
}
