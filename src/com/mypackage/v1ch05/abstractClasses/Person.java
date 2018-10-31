package com.mypackage.v1ch05.abstractClasses;

/**
 * 描述:
 * Person
 *
 * @author TianBeilei
 * @version V1.0
 * @create 2018年10月09日  10:17
 */
public abstract class Person {
    public abstract String getDescription();
    private String name;

    public Person(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

}
