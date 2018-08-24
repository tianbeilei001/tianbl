package com.tianbl.v1ch04;

import java.text.NumberFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * Created with IntelliJ IDEA.
 *
 * @author TianBeilei
 * @version V1.0
 * @date 2018年04月12日 16:03
 */
public class CalendarTest {
    public static void main(String[] args)
    {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();
        // Set to start of month
        int a =today-1;
        date = date.minusDays(a);
        DayOfWeek weekday = date.getDayOfWeek();
        // 1 = Monday, ... 7 = Sunday
        int value = weekday.getValue();
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < value; i++) {
            System.out.print("    ");
        }
        while (date.getMonthValue() == month)
        {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today) {
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1){ System.out.println();}
        }
        if (date.getDayOfWeek().getValue() != 1){ System.out.println();}
    }
}
