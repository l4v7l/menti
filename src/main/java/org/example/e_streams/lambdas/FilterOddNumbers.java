package org.example.e_streams.lambdas;

import java.util.List;
import java.util.function.Predicate;

public class FilterOddNumbers {

    public static void main(String[] args) {

        Predicate<Integer> filterEven = x -> x % 2 == 0;
        Predicate<Integer> filterOdd = x -> x % 2 != 0;

        List<Integer> listInt = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        System.out.println("Evens: ");
        listInt.stream().filter(filterEven).forEach(System.out::println);
        System.out.println("Odds: ");
        listInt.stream().filter(filterOdd).forEach(System.out::println);
    }

}
