package org.example.a_javaBase.b;

import java.util.Arrays;

public class FindKLargestElements {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,67,8,56,43,45,98};
        int k = 3;

        Arrays.sort(numbers);
        for (int i = numbers.length - k; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}

