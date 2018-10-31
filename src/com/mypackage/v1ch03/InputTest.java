package com.mypackage.v1ch03;

import java.util.Scanner;

/**
 * 描述:
 * 标准输入输出
 *
 * @author TianBeilei
 * @version V1.0
 * @create 2018年09月26日  15:56
 */
public class InputTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // get first input
        System.out.println("What is your name? ");
        String name = scanner.nextLine();

        // get second input
        System.out.print("How old are you? ");
        int age = scanner.nextInt();

        // display output on console
        System.out.println("Hello, " + name + ". Next year, you'll be " + (age + 1));

    }
}
