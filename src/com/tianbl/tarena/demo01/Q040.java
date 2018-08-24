package com.tianbl.tarena.demo01;

/**
 * Created with IntelliJ IDEA.
 *
 * @author TianBeilei
 * @version V1.0
 * @date 2018年07月16日 16:01
 */
public class Q040 {
    public static void main(String[] args) {
        System.out.println("第一个月兔子对数: 1");
        System.out.println("第二个月兔子对数: 1");
        int f1 = 1,f2=1,f,M=24;
        for(int i =3;i<=M;i++){
            f =f2;
            f2 = f1+f2;
            f1 =f;
            System.out.println("第"+i+"个月兔子对数:"+f2);

        }
    }
}
