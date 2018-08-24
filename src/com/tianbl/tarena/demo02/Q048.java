package com.tianbl.tarena.demo02;

/**
 * Created with IntelliJ IDEA.
 *
 * @author TianBeilei
 * @version V1.0
 * @date 2018年07月19日 15:44
 */
public class Q048 {
    public static int getAge(int a){
        if(a==1){
            return 10;
        }else{
            return getAge(a-1)+2;
        }

    }

    public static void main(String[] args) {
        int a =5;
        int b = getAge(a);
        System.out.println(b);
    }
}
