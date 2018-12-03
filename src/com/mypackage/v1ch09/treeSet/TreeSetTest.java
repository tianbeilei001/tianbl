package com.mypackage.v1ch09.treeSet;
import java.util.*;

/**
 * 描述:
 * TreeSetTest
 *
 * @author TianBeilei
 * @version V1.0
 * @create 2018年11月02日  9:57
 */
public class TreeSetTest {
    public static void main(String[] args) {
        SortedSet<Item> parts = new TreeSet<>();
        parts.add(new Item("Toaster", 1234));
        parts.add(new Item("Widget", 4562));
        parts.add(new Item("Modem", 9912));
        System.out.println(parts);

        NavigableSet<Item> sortByDescription = new TreeSet<>(
                Comparator.comparing(Item::getDescription));

        sortByDescription.addAll(parts);
        System.out.println(sortByDescription);
    }
}
