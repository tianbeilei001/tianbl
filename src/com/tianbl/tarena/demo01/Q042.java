package com.tianbl.tarena.demo01;

/**
 * Created with IntelliJ IDEA.
 *
 * @author TianBeilei
 * @version V1.0
 * @date 2018年07月16日 17:20
 */
public class Q042 {
    public static void  main(String[] args){
        boolean b = judge(10,21);
        System.out.println(b);
    }
    public static boolean judge(int x,int y){
        return (x<y?y%x:x%y)==0;
    }
}
