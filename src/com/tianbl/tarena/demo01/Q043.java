package com.tianbl.tarena.demo01;

import com.sun.jdi.PathSearchingVirtualMachine;

/**
 * Created with IntelliJ IDEA.
 *
 * @author TianBeilei
 * @version V1.0
 * @date 2018年07月16日 17:33
 */
public class Q043 {
    public static void main(String[] args) {
        String hex = hexConvert(7);
        System.out.println(hex);

    }
    public static String hexConvert(int d){
        String s ="";
        do{
            int f =d%2;
            if(f==1){
                s="1"+s;
            }else if(f==0){
                s="0"+s;
            }
            d/=2;

        }while(d!=0);
        return s;

    }
}
