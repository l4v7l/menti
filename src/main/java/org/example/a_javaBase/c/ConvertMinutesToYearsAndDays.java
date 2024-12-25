package org.example.a_javaBase.c;

/**
 * Write a Java program to convert minutes into years and days.
 */
public class ConvertMinutesToYearsAndDays {
    public static void main(String[] args) {
        int minutes = 142787;

        int years = minutes / 60 / 24 / 365;
        int days = (minutes - years * 60 * 24 * 365) / 60 / 24;

        System.out.println(minutes + " минут это " + years + " лет, " + days + " дней");
    }
}
