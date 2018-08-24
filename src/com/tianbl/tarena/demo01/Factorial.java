package com.tianbl.tarena.demo01;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author TianBeilei
 * @version V1.0
 * @date 2018年07月12日 11:00
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字!");
        long n = scanner.nextLong();
        scanner.close();
        System.out.println(doFactorial(n));

    }
    public static long doFactorial(long n){
        if(n<1){
            System.out.println("ERROR");
            return 0;
        }else if(n==1||n==2){
            return  n;
        }else{
            return n*doFactorial(n-1);
        }
    }
}
