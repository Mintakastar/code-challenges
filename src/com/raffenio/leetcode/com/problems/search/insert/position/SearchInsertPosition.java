package com.raffenio.leetcode.com.problems.search.insert.position;

/**
 * Exercise https://leetcode.com/problems/search-insert-position/
 *
 * Given a sorted array of distinct integers and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * Example 1:
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 *
 * Example 2:
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 *
 * Example 3:
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 *
 * Constraints:
 * 1 <= nums.length <= 104
 * -104 <= nums[i] <= 104
 * nums contains distinct values sorted in ascending order.
 * -104 <= target <= 104
 */
public class SearchInsertPosition {
    public static void main(String[] args) {
        SearchInsertPositionSolution solution = new SearchInsertPositionSolution();

        System.out.println("Solution with lineal search O(n) complexity");

        int[] nums1 = {1, 3, 5, 6};
        int target1 = 5;
        System.out.println("Example 1, Expected: 2 Result: " + solution.searchInsertLinealSolution(nums1, target1)); // Output: 2

        int[] nums2 = {1, 3, 5, 6};
        int target2 = 2;
        System.out.println("Example 2, Expected: 1 Result: " + solution.searchInsertLinealSolution(nums2, target2)); // Output: 1

        int[] nums3 = {1, 3, 5, 6};
        int target3 = 7;
        System.out.println("Example 3, Expected: 4 Result: " + solution.searchInsertLinealSolution(nums3, target3)); // Output: 4

        int[] nums4 = {1, 3, 5, 6};
        int target4 = 0;
        System.out.println("Example 4, Expected: 0 Result: " + solution.searchInsertLinealSolution(nums4, target4)); // Output: 0


        System.out.println("\nSolution with lineal search O( log(n) ) complexity");

        int[] nums11 = {1, 3, 5, 6};
        int target11 = 5;
        System.out.println("Example 1, Expected: 2 Result: " + solution.searchInsertBinarySearchLogN(nums11, target11)); // Output: 2

        int[] nums22 = {1, 3, 5, 6};
        int target22 = 2;
        System.out.println("Example 2, Expected: 1 Result: " + solution.searchInsertBinarySearchLogN(nums22, target22)); // Output: 1

        int[] nums33 = {1, 3, 5, 6};
        int target33 = 7;
        System.out.println("Example 3, Expected: 4 Result: " + solution.searchInsertBinarySearchLogN(nums33, target33)); // Output: 4

        int[] nums44 = {1, 3, 5, 6};
        int target44 = 0;
        System.out.println("Example 4, Expected: 0 Result: " + solution.searchInsertBinarySearchLogN(nums44, target44)); // Output: 0

    }
}
