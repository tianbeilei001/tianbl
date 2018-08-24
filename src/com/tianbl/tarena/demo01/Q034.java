package com.tianbl.tarena.demo01;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author TianBeilei
 * @version V1.0
 * @date 2018年07月16日 10:08
 */
public class Q034 {
    public static boolean prime(int n){
        if(n<=0){
            System.exit(0);
        }
        for(int i=2;i<=n;i++){
            for(int j=2;j<=Math.sqrt(i);j++){
                if(n%j==0&&j!=n){
                    return false;
                }

            }

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入整数");
        int a =  scanner.nextInt();
        scanner.close();
        boolean flag =prime(a);
        System.out.println(flag);
    }
}
