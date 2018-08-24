package com.tianbl.tarena.demo02;

/**
 * Created with IntelliJ IDEA.
 *
 * @author TianBeilei
 * @version V1.0
 * @date 2018年07月19日 16:05
 */
public class Q050 {
    public static void main(String[] args) {
        int i;
        int num = 1020;
        for(i=1;;i++){
            num = num- (num/2+2);
            System.out.println("第"+i+"天后剩下"+num+"个");
            if(num==0){
                break;
            }
        }
        System.out.println(i+"天卖完");
    }
}
