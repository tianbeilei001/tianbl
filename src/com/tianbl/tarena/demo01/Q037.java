package com.tianbl.tarena.demo01;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @author TianBeilei
 * @version V1.0
 * @date 2018年07月16日 11:27
 */
public class Q037 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push("123456");
        Object object= stack.pop();
        System.out.println(object);
        object = stack.pop();
        System.out.println(object);

    }




}
class Stack{
    /**
     * 栈的内容
     */
    private Object[] data;
    /**
     * 栈内元素个数
     */
    private  int size=0;
    public Stack(){
        data = new Object[0];
    }

    /**
     *判断栈是否满
     * @return
     */
    public  boolean isFull(){
        return  data.length == size || (data.length==0&&size==0);
    }

    /**
     * 判断栈是否空
     * @return
     */
    public  boolean isEmpty(){
        return size ==0;
    }

    /**
     * 数组扩容至10个
     */
    public void increaData(){
        data = Arrays.copyOf(data,data.length+10);
    }

    /**
     * 入栈
     * @param object
     */
    public void push(Object object){
        if(isFull()){
            increaData();
        }
        size++;
        data[size-1]=object;

    }
    public Object pop(){
       Object o = data[size - 1];
       data[size -1 ] = null;
       size--;
       return  o;
    }

}
