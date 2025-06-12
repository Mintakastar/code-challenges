package com.raffenio.hackerrank.com.challenges.one.week.preparation.kit.lonely.integer;


import java.util.Arrays;
import java.util.List;

/* * Lonely Integer
 * Exercise: https://www.hackerrank.com/challenges/one-week-preparation-kit-lonely-integer/problem
 * */
public class LonelyInteger {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        List<Integer> example1 = Arrays.asList(1,2,3,4,3,2,1);
        int lonelyInteger = solution.lonelyintegerSorting(example1);
        System.out.println("Input: [1, 2, 3, 4, 3, 2, 1]");
        System.out.println("Expected output: 4");
        System.out.println("Algorithm Output: " + lonelyInteger);
        System.out.println("");

        example1 = Arrays.asList(1,2,3,4,3,2,1);
        lonelyInteger = solution.lonelyintegerIndex(example1);
        System.out.println("Input: [1, 2, 3, 4, 3, 2, 1]");
        System.out.println("Expected output: 4");
        System.out.println("Algorithm Output: " + lonelyInteger);


        System.out.println("");
        System.out.println("");

        // Example 2
        List<Integer> example2= Arrays.asList(1,1,2);
        lonelyInteger = solution.lonelyintegerSorting(example2);
        System.out.println("Input: [1, 1, 2]");
        System.out.println("Expected output: 2");
        System.out.println("Algorithm Output: " + lonelyInteger);
        System.out.println("");

        example2= Arrays.asList(1,1,2);
        lonelyInteger = solution.lonelyintegerIndex(example2);
        System.out.println("Input: [1, 1, 2]");
        System.out.println("Expected output: 2");
        System.out.println("Algorithm Output: " + lonelyInteger);

    }
}
