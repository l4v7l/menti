package org.example.d_collections.array;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

        System.out.println(Arrays.toString(reverse(arr)));
    }

    public static int[] reverse(int[] arr) {
        int size = arr.length;

        int[] revArr = new int[size];

        for (int i = 0; i < size; i++) {
            revArr[size - 1 - i] = arr[i];
        }

        return revArr;
    }
}
