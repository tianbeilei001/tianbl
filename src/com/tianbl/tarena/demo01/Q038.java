package com.tianbl.tarena.demo01;

/**
 * Created with IntelliJ IDEA.
 *
 * @author TianBeilei
 * @version V1.0
 * @date 2018年07月16日 14:44
 */
public class Q038 {
    public static void main(String[] args){
        int a =3;
        int b =2;
        int c =9;
        a=b-a;
        b=b-a;
        a=a+b;
        b=c-b;
        c=c-b;
        b=c+b;
        System.out.println("a="+a+",b="+b+",c="+c);
    }
}
