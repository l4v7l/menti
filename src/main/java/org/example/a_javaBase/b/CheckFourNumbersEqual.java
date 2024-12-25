package org.example.a_javaBase.b;

import java.util.Scanner;

/**
 * Write a Java program that accepts four integers from the user and prints equal if all four are equal, and not equal otherwise.
 */
public class CheckFourNumbersEqual {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int prev;
        int cur;
        boolean res = true;

        System.out.println("Введите 1ое число");
        prev = sc.nextInt();

        for (int i = 2; i <= 4; i++) {
            System.out.println("Введите " + i + "ое число");
            cur = sc.nextInt();

            if (cur != prev)
                res = false;
        }

        System.out.println(res);

    }
}
