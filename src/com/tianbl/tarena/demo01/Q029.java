package com.tianbl.tarena.demo01;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author TianBeilei
 * @version V1.0
 * @date 2018年07月12日 17:42
 */
public class Q029 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[2];
        System.out.println("请输入第一个整数:");
        nums[0] = scanner.nextInt();
        System.out.println("请输入第二个整数:");
        nums[1] = scanner.nextInt();
        Arrays.sort(nums);
        int sum =0;
        for(int begin = nums[0]+1;begin<nums[1];begin++){
            if(begin%5==0){
                sum+=begin;
                System.out.println(begin);
            }
        }
        System.out.println(sum);

    }
}
