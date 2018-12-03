package com.mypackage.v1ch09.priorityQueue;

import java.time.LocalDate;
import java.util.PriorityQueue;

/**
 * 描述:
 *
 * @author TianBeilei
 * @version V1.0
 * @create 2018年11月02日  10:23
 */
public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<LocalDate> pq = new PriorityQueue<>();
        pq.add(LocalDate.of(1906, 12, 9));
        pq.add(LocalDate.of(1815, 12, 10));
        pq.add(LocalDate.of(1903, 12, 3));
        pq.add(LocalDate.of(1910, 6, 22));

        System.out.println("Iterating over elements...");

        for (LocalDate date:pq){
            System.out.println(date);
        }
        System.out.println("Removing elements...");
        while(!pq.isEmpty()){
            System.out.println(pq.remove());
        }
    }
}
