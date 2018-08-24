package com.tianbl.v1ch09.map;

/**
 * A minimalist employee class for testing purposes.
 */
public class Employee
{
   private String name;
   private double salary;

   /**
    * Constructs an employee with $0 salary.
    * @param
    */
   public Employee(String name)
   {
      this.name = name;
      salary = 0;
   }
@Override
   public String toString()
   {
      return "[name=" + name + ", salary=" + salary + "]";
   }
}