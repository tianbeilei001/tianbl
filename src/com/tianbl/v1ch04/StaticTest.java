package com.tianbl.v1ch04;

/**
 * This program demonstrates static methods.
 * @version 1.01 2004-02-19
 * @author Cay Horstmann
 */
public class StaticTest
{
   public static void main(String[] args)
   {
      // fill the staff array with three Employee objects
      Employee_01[] staff = new Employee_01[3];

      staff[0] = new Employee_01("Tom", 40000);
      staff[1] = new Employee_01("Dick", 60000);
      staff[2] = new Employee_01("Harry", 65000);

      // print out information about all Employee objects
      for (Employee_01 e : staff)
      {
         e.setId();
         System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary="
               + e.getSalary());
      }

      int n = Employee_01.getNextId();
      System.out.println("Next available id=" + n);
   }
}

class Employee_01
{
   private static int nextId = 1;

   private String name;
   private double salary;
   private int id;

   public Employee_01(String n, double s)
   {
      name = n;
      salary = s;
      id = 0;
   }

   public String getName()
   {
      return name;
   }

   public double getSalary()
   {
      return salary;
   }

   public int getId()
   {
      return id;
   }

   public void setId()
   {
      id = nextId;
      nextId++;
   }

   public static int getNextId()
   {
      return nextId;
   }

   public static void main(String[] args) // unit test
   {
      Employee_01 e = new Employee_01("Harry", 50000);
      System.out.println(e.getName() + " " + e.getSalary());
   }
}
