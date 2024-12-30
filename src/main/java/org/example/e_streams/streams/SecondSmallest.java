package org.example.e_streams.streams;


import java.util.List;

/**
 * Write a Java program to find the second smallest and largest elements in a list of integers using streams.
 */
public class SecondSmallest {

    public static void main(String[] args) {

        List<Integer> list = List.of(90, 91, 0, 1, 2, 3, 4, 5, 6, 7);

        System.out.println(list.stream().sorted().skip(1).findFirst());

        System.out.println(list.stream().sorted((x, y) -> y - x).skip(1).findFirst());

    }
}
