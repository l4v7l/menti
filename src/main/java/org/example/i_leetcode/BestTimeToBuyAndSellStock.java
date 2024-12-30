package org.example.i_leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 121. You are given an array prices where prices[i] is the price of a given stock on the ith day.
 *
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 *
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */
public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4}; // output: 5 (6 - 1)
        int[] prices2 = {7,6,4,3,1}; // output: 0  (no chance to get a profit)
        int[] prices3 = {2,4,1}; // output: 2
        int[] prices4 = {1,2}; // output: 2

        System.out.println(findMaxProfit(prices4));
    }


    //Time Limit Exceeded
    public static int findMaxProfit1(int[] arr) {

        List<Integer> choices = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int max = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }

            choices.add(max - arr[i]);
        }

        return Collections.max(choices);
    }


    //работает, но все равно Time Limit Exceeded

    public static int findMaxProfit(int[] arr) {
        List<Integer> arrList = Arrays.stream(arr).boxed().toList();
        List<Integer> choices = new ArrayList<>();
        return findMaxProfit(choices, arrList);
    }

    public static int findMaxProfit(List<Integer> choices, List<Integer> arr) {

        int max = arr.getFirst();
        int indexMax = 0;

        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
                indexMax = i;
            }
        }

        if (!arr.subList(0, indexMax).isEmpty()) {
            choices.add(max - Collections.min(arr.subList(0, indexMax)));
        }

        if (!arr.subList(indexMax + 1, arr.size()).isEmpty()) {
            findMaxProfit(choices, arr.subList(indexMax + 1, arr.size()));
        }

        return choices.isEmpty() ? 0 : Collections.max(choices);

    }


}
