package com.darren;

import java.lang.management.MemoryPoolMXBean;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner Input = new Scanner(System.in);
        Employee Empl = new Employee();
        String NName,SSurname,EmpNum;
        Double Salary, Perc;

        System.out.println("Please enter name");
        NName = Input.next();

        System.out.println("Please enter Surname");
        SSurname = Input.next();

        EmpNum ="45xxx22";

        System.out.println("Please enter Salary amount");
        Salary = Input.nextDouble();

        System.out.println("Please enter Increased percentage");
        Perc = Input.nextDouble();
        Empl.setEmpName(NName);
        Empl.setEmpSurname(SSurname);
        Empl.setEmpNumber(EmpNum);
        Empl.setEmpSalary(Salary);
        Empl.increaseSalary(Perc);

        System.out.println(Empl.toString());

    }
}
