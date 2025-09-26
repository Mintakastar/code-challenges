package com.raffenio.leetcode.com.problems.three3sum;
//https://leetcode.com/problems/3sum/
public class Three3Sum {
    public static void main(String[] args) {
        // This is the main class for the Three3Sum problem.
        // You can implement test cases and call the solution methods here.
        // For example:
        Three3SumSolution solution = new Three3SumSolution();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println("Test case 1, Result: " + solution.threeSum(nums)); // Expected: [[-1, -1, 2], [-1, 0, 1]]

        // Add more test cases as needed.
        // For example:
        int[] nums2 = {0, 1, 1};
        System.out.println("Test case 2, Result: " + solution.threeSum(nums2)); // Expected: []
        int[] nums3 = {0, 0, 0};
        System.out.println("Test case 3, Result: " + solution.threeSum(nums3)); // Expected: [[0, 0, 0]]

        // Add more test cases as needed.
        // For example:
        int[] nums4 = {-2,0,1,1,2};
        System.out.println("Test case 4, Result: " + solution.threeSum(nums4)); // Expected: [[-2,0,2],[-2,1,1]]
    }
}
