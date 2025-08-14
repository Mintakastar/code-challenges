package com.raffenio.leetcode.com.problems.search.insert.position;

import java.util.Arrays;

/**
 * Exercise https://leetcode.com/problems/search-insert-position/
 */
public class SearchInsertPositionSolution {
    /**
     * Given a sorted array of distinct integers and a target value, return the index if the target is found.
     * Logarithmic solution with O(log n) complexity using binary search.
     *
     * Runtime   0   ms, Beats 100.00%   O(n) time complexity
     * Memory  43.64 MB, Beats   5.78%   O(1) space complexity
     *
     */
    public int searchInsertBinarySearchLogN(int[] nums, int target) {
        //System.out.println("Searching for target: " + target + " in array: " + Arrays.toString(nums)); //uncomment for debugging
        int index = Arrays.binarySearch(nums, target);
        //System.out.println("Index found: " + index); //uncomment for debugging
        return index >= 0 ? index : -index - 1;
    }

    /**
     * Given a sorted array of distinct integers and a target value, return the index if the target is found.
     * Lineal solution with O(n) complexity.
     *
     * Runtime    0 ms, Beats 100.00%    O(n) time complexity
     * Memory 43.03 MB, Beats  50.85%    O(1) space complexity
     *
     */
    public int searchInsertLinealSolution(int[] nums, int target) {
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i]>= target){
                return i;
            }
        }
        return nums.length;
    }
}