package com.mypackage.v1ch07.exceptional;

import java.util.Date;
import java.util.EmptyStackException;
import java.util.Stack;

/**
 * 描述:
 * ExceptionalTest
 *
 * @author TianBeilei
 * @version V1.0
 * @create 2018年10月23日  9:33
 */
public class ExceptionalTest {
    public static void main(String[] args) {
        int i=0;
        int ntry = 10000000;
        Stack<String> s=new Stack<>();
        long s1;
        long s2;

        // test a stack for emptiness ntry times
        System.out.println("Testing for empty stack");
        s1 =System.currentTimeMillis();
        for(i=0;i<=ntry;i++){
            if(!s.isEmpty()){
                s.pop();
            }
        }
        s2 =System.currentTimeMillis();
        System.out.println((s2 - s1) + " milliseconds");

        // pop an empty stack ntry times and catch the resulting exception
        System.out.println("Catching EmptyStackException");
        s1 =System.currentTimeMillis();
       for(i=0;i<=ntry;i++){
           try {
               s.pop();
           }catch(EmptyStackException e){

           }
       }
       s2 = System.currentTimeMillis();
       System.out.println((s2 - s1) + " milliseconds");

    }
}
