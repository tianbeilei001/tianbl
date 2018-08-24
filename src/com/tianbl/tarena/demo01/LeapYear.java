package com.tianbl.tarena.demo01;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author TianBeilei
 * @version V1.0
 * @date 2018年07月12日 9:39
 */
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份(例如:2012)");
        int year = scanner.nextInt();
        scanner.close();
        boolean isLeapYear = (year%4==0&&year%100!=0)||year%400==0;
        String msg = isLeapYear?year+"是闰年":year+"不是闰年";
        System.out.println(msg);
    }
}
