package com.springcore.noxml;


public class Student {
    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public Student(Employee employee) {
        super();
        this.employee = employee;
    }

    public Student() {
        super();
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void study()
    {
        this.employee.display();
        System.out.println("Student is studing");
    }

    @Override
    public String toString() {
        return "Student{" +
                "employee=" + employee +
                '}';
    }
}
