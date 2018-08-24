package com.tianbl.tarena.demo01;

/**
 * Created with IntelliJ IDEA.
 *
 * @author TianBeilei
 * @version V1.0
 * @date 2018年07月12日 16:47
 */
public class Foo {
    public static void main(String[] args) {
        int random = (int)(Math.random()*Integer.MAX_VALUE+1);
        String str = Integer.toBinaryString(random);
        if(str.length()<32){
            for(int j=0;j<32-str.length();j++){
                str="0"+str;
            }
        }
        int[] a  =new int[32];
        for(int i=0;i<str.length();i++){
            a[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
            System.out.println("a["+i+"]="+a[i]);
        }
    }
}
