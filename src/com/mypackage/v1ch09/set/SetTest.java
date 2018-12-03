package com.mypackage.v1ch09.set;

import java.util.*;

/**
 * 描述:
 *
 * @author TianBeilei
 * @version V1.0
 * @create 2018年11月01日  15:12
 */
public class SetTest {
    public static void main(String[] args) {
        Set<String> words = new HashSet<>(); // HashSet implements Set
        long totalTime = 0;

        try (Scanner in = new Scanner(System.in))
        {
            while (in.hasNext())
            {
                String word = in.next();
                long callTime = System.currentTimeMillis();
                words.add(word);
                callTime = System.currentTimeMillis() - callTime;
                totalTime += callTime;
            }
        }

        Iterator<String> iter = words.iterator();
        for (int i = 1; i <= 20 && iter.hasNext(); i++)
        {
            System.out.println(iter.next());
        }
        System.out.println(". . .");
        System.out.println(words.size() + " distinct words. " + totalTime + " milliseconds.");

    }
}
