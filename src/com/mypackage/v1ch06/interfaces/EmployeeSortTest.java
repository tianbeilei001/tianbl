package com.mypackage.v1ch06.interfaces;

import java.util.Arrays;

/**
 * 描述:
 * EmployeeSortTest
 *
 * @author TianBeilei
 * @version V1.0
 * @create 2018年10月10日  11:30
 */
public class EmployeeSortTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Harry Hacker", 35000);
        staff[1] = new Employee("Carl Cracker", 75000);
        staff[2] = new Employee("Tony Tester", 38000);

        Arrays.sort(staff);

        // print out information about all Employee objects
        for (Employee e : staff) {
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
        }
    }
}
