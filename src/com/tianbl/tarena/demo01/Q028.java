package com.tianbl.tarena.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author TianBeilei
 * @version V1.0
 * @date 2018年07月12日 17:09
 */
public class Q028 {
    public  static List<String> list = new ArrayList<String>();
    public static  void group(String str,String nstr){
        if (str.length()!=nstr.length()) {
            String rest = getRest(str,nstr);
            for(int i=0;i<rest.length();i++){
                String temp = str + rest.substring(i,i+1);
                if(temp.indexOf("4")!=2&&temp.indexOf("35")==-1&&temp.indexOf("53")==-1){
                    if(!list.contains(temp)&&temp.length()==nstr.length()){
                        list.add(temp);
                    }
                    group(temp,nstr);
                }
            }

        }

    }
    public static  String  getRest(String str,String nstr){
        String rest="";
        if(nstr.length()>str.length()){
            rest = nstr;
            for(int i=0;i<str.length();i++){
                rest = rest.replaceFirst(str.substring(i,i+1),"");
            }
        }
        return rest;
    }

    public static void main(String[] args) {
        group("","122345");
        System.out.println(list.toString());
    }
}
