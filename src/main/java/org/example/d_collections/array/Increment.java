package org.example.d_collections.array;

import java.util.Arrays;

/**
 * increment the number in array
 */

public class Increment {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] arr1 = {9, 9, 9, 9};

        System.out.println(Arrays.toString(increment(arr1)));

    }

    public static int[] increment(int[] arr) {
        int size = arr.length;

        if (size == 0) {
            return null;
        }

        for (int j : arr) {
            if (j > 9 || j < 0) {
                return null;
            }
        }

        for (int i = size - 1; i >= 0; i--) {
            if (arr[i] != 9) {
                arr[i]++;
                break;
            } else {
                arr[i] = 0;
                if (i == 0) {
                    int[] res = new int[size + 1];
                    res[0] = 1;
                    return res;
                }
            }
        }

        return arr;
    }
}
