package com.tianbl.tarena.demo01;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author TianBeilei
 * @version V1.0
 * @date 2018年07月11日 18:34
 */
public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年龄");
        int age =scanner.nextInt();
        scanner.close();
        System.out.println(age>=18&&age<=50);
    }
}
