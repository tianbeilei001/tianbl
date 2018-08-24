package com.tianbl.v1ch05.abstractClasses;

/**
 * Created with IntelliJ IDEA.
 *
 * @author TianBeilei
 * @version V1.0
 * @date 2018年05月18日 10:41
 */
public class Student extends Person {
    private String major;

    /**
     * @param nama the student's name
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
