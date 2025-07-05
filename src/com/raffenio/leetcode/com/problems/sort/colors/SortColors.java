package com.raffenio.leetcode.com.problems.sort.colors;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/sort-colors/
 */
public class SortColors {

    public static void main(String[] args) {
        Solution solution = new Solution();


        // first solution -----------------------------------------------
        int [] numbs = {2,0,2,1,1,0};
        solution.sortColors_linealPass(numbs);
        String solutionString = "[0, 0, 1, 1, 2, 2]";
        System.out.println("Output__: "+Arrays.toString(numbs) );
        System.out.println("Solution: "+solutionString+" : "+Arrays.toString(numbs).equals(solutionString));

        System.out.println("Test passed: " + Arrays.toString(numbs).equals(solutionString));

        System.out.println();



        int [] numbs2 = {2,0,1};
        solution.sortColors_linealPass(numbs2);
        solutionString = "[0, 1, 2]";
        System.out.println("Output__: "+Arrays.toString(numbs2) );
        System.out.println("Solution: "+solutionString+" : "+Arrays.toString(numbs2).equals(solutionString));

        System.out.println("Test passed: " + Arrays.toString(numbs2).equals(solutionString));


        System.out.println();
        System.out.println();

        // second solution -----------------------------------------------
        int [] numbs3 = {2,0,2,1,1,0};
        solution.sortColors_2pointers(numbs3);
        solutionString = "[0, 0, 1, 1, 2, 2]";
        System.out.println("Output__: "+Arrays.toString(numbs3) );
        System.out.println("Solution: "+solutionString+" : "+Arrays.toString(numbs3).equals(solutionString));

        System.out.println("Test passed: " + Arrays.toString(numbs3).equals(solutionString));

        System.out.println();


        int [] numbs4 = {2,0,1};
        solution.sortColors_2pointers(numbs4);
        solutionString = "[0, 1, 2]";
        System.out.println("Output__: "+Arrays.toString(numbs4) );
        System.out.println("Solution: "+solutionString+" : "+Arrays.toString(numbs4).equals(solutionString));

        System.out.println("Test passed: " + Arrays.toString(numbs4).equals(solutionString));


    }
}
