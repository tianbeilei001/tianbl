package com.mypackage.v1ch09.shuffle;
import  java.util.*;

/**
 * 描述:
 *
 * @author TianBeilei
 * @version V1.0
 * @create 2018年11月05日  11:33
 */
public class ShuffleTest {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 49; i++)
        {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        List<Integer> winningCombination = numbers.subList(0, 6);
        Collections.sort(winningCombination);
        System.out.println(winningCombination);
    }
}
