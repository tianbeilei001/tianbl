package com.mypackage.v1ch05.objectAnalyzer;

import java.util.ArrayList;

/**
 * 描述:
 * ObjectAnalyzerTest
 *
 * @author TianBeilei
 * @version V1.0
 * @create 2018年10月10日  9:32
 */
public class ObjectAnalyzerTest {
    public static void main(String[] args) {
        ArrayList<Integer> squares = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            squares.add(i * i);
        }
        System.out.println(new ObjectAnalyzer().toString(squares));
    }
}
