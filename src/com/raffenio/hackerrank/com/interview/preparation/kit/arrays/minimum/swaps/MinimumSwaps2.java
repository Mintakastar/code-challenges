package com.raffenio.hackerrank.com.interview.preparation.kit.arrays.minimum.swaps;


/*
* Minimum Swaps 2
* Exercice: https://www.hackerrank.com/challenges/minimum-swaps-2
* */
public class MinimumSwaps2 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        //solution.selectedAlgorithm=Solution.SortAlgorithm.BUBBLE; // outputs 7
        //solution.selectedAlgorithm=Solution.SortAlgorithm.QUICK; // outputs 5, which is the correct answer
        solution.selectedAlgorithm=Solution.SortAlgorithm.SOLUTION; // great!

        System.out.println("\n\nExample 1:");
        int swaps = solution.minimumSwaps(new int[]{7, 1, 3, 2, 4, 5, 6});
        System.out.println("Input: "+ "[7, 1, 3, 2, 4, 5, 6]");
        System.out.println("Expected output: 5");

        System.out.println("\nAlgorithm Output: "+ swaps);



        System.out.println("\n\nExample 2:");
        swaps = solution.minimumSwaps(new int[]{1, 3, 5, 2, 4, 6, 7});
        System.out.println("Input: "+ "[1, 3, 5, 2, 4, 6, 7]");
        System.out.println("Expected output: 3");

        System.out.println("\nAlgorithm Output: "+ swaps);





        System.out.println("\n\nExample 2:");
        swaps = solution.minimumSwaps(new int[]{1, 3, 5, 2, 4, 6, 7});
        System.out.println("Input: "+ "[1, 3, 5, 2, 4, 6, 7]");
        System.out.println("Expected output: 3");

        System.out.println("\nAlgorithm Output: "+ swaps);


        System.out.println("\n\nExample 3  :");
        swaps = solution.minimumSwaps(new int[]{3, 7, 6, 9, 1, 8, 10, 4, 2, 5});
        System.out.println("Input: "+ "[3, 7, 6, 9, 1, 8, 10, 4, 2, 5]");
        System.out.println("Expected output: 9");

        System.out.println("\nAlgorithm Output: "+ swaps);

    }



}
