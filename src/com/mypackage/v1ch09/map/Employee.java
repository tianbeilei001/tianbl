package com.mypackage.v1ch09.map;

/**
 * 描述:
 * Employee
 *
 * @author TianBeilei
 * @version V1.0
 * @create 2018年11月02日  14:12
 */
public class Employee {
    private String name;
    private double salary;
    /**
     * Constructs an employee with $0 salary.
     * @param n the employee name
     */
     public Employee(String n){
         this.name = n;
         this.salary = 0;
     }
     @Override
     public String toString(){
         return "[name=" + name + ", salary=" + salary + "]";
     }
}
