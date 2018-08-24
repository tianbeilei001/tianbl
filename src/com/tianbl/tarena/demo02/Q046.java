package com.tianbl.tarena.demo02;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author TianBeilei
 * @version V1.0
 * @date 2018年07月19日 15:18
 */
public class Q046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字:");
        long  inputValueLong = scanner.nextLong();
        scanner.close();
        long temp = inputValueLong;
        long reverseLong = 0L;
        while(inputValueLong!=0L){
            reverseLong = reverseLong*10+inputValueLong%10;
            inputValueLong =inputValueLong/10;
        }
        if(reverseLong==temp){
            System.out.println("你输入的是回文数字");
        }else{
            System.out.println("你输入的不是回文数字");
        }
    }
}
