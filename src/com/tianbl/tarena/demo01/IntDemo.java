package com.tianbl.tarena.demo01;

import java.sql.SQLOutput;

/**
 * Created with IntelliJ IDEA.
 *
 * @author TianBeilei
 * @version V1.0
 * @date 2018年07月11日 18:02
 */
public class IntDemo {
    public static void main(String[] args) {
      int a = 1,b=10;
      int c1 = a++;
      int c2 = ++b;
      System.out.println("a="+a+",b="+b+",c1="+c1+",c2="+c2);
      int i=100,j=200;
      boolean b1 = (i>j)&&(i++>100);
      System.out.println(b1);
      System.out.println(i);
    }
}
