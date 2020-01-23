package com.darren;

public class Employee {
    private String empName;
    private String empSurname;
    private String empNumber;
    private Double empSalary;

    public Employee() {
    }

    public Employee(String empName, String empSurname, String empNumber) {
        this.empName = empName;
        this.empSurname = empSurname;
        this.empNumber = empNumber;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpSurname() {
        return empSurname;
    }

    public void setEmpSurname(String empSurname) {
        this.empSurname = empSurname;
    }

    public String getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(String empNumber) {
        this.empNumber = empNumber;
    }

    public Double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(Double empSalary) {
        this.empSalary = empSalary;
    }

    public void  increaseSalary(double amt) {
        this.empSalary = this.empSalary + (this.empSalary*(amt/100));
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empSurname='" + empSurname + '\'' +
                ", empNumber='" + empNumber + '\'' +
                ", empSalary=" + empSalary +
                '}';
    }
}
