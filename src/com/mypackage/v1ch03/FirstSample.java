package com.mypackage.v1ch03;

/**
 * Created with IntelliJ IDEA.
 * This is the first sample program in Core Java Chapter 3
 * @author TianBeilei
 * @version V1.0
 * @date 2018年08月23日 9:33
 */
public class FirstSample {
    public static void main(String[] args){
        System.out.println("We will not use 'Hello, World!'");
        boolean a = Character.isJavaIdentifierStart('$');
        System.out.println(a);
        double x= 4;
        double y = Math.sqrt(x);
        System.out.println(y);
        double z = Math.pow(4,4);
        System.out.println(z);
    }
}
