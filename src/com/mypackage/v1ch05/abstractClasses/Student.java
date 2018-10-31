package com.mypackage.v1ch05.abstractClasses;

/**
 * 描述:
 * Student
 *
 * @author TianBeilei
 * @version V1.0
 * @create 2018年10月09日  10:18
 */
public class Student extends Person {
    private String major;

    /**
     * @param name the student's name
     * @param major the student's major
     */
    public Student(String name, String major)
    {
        // pass n to superclass constructor
        super(name);
        this.major = major;
    }
    @Override
    public String getDescription()
    {
        return "a student majoring in " + major;
    }
}
