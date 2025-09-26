package com.raffenio.leetcode.com.problems.two.sum.ii.input.array.is.sorted;

public class TwoSumII {

    //https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

    public static void main(String[] args) {
        //test case
        TwoSumIISolution solution = new TwoSumIISolution();
        int[] numbers = {2,7,11,15};
        int target = 9;
        int[] result = solution.twoSumUsingTwoPointer(numbers, target);
        System.out.println("Test case 1, Expected: [1,2]  Result: [" + result[0] + "," + result[1] + "]"); // Expected: [1,2]
        result = solution.twoSumUsingMap(numbers, target);
        System.out.println("Test case 1, Expected: [1,2]  Result: [" + result[0] + "," + result[1] + "]"); // Expected: [1,2]

        int[] numbers2 = {2,3,4};
        int target2 = 6;
        int[] result2 = solution.twoSumUsingTwoPointer(numbers2, target2);
        System.out.println("Test case 2, Expected: [1,3]  Result: [" + result2[0] + "," + result2[1] + "]"); // Expected: [1,3]
        result2 = solution.twoSumUsingMap(numbers2, target2);
        System.out.println("Test case 2, Expected: [1,3]  Result: [" + result2[0] + "," + result2[1] + "]"); // Expected: [1,3]

        int[] numbers3 = {-1,0};
        int target3 = -1;
        int[] result3 = solution.twoSumUsingTwoPointer(numbers3, target3);
        System.out.println("Test case 3, Expected: [1,2]  Result: [" + result3[0] + "," + result3[1] + "]"); // Expected: [1,2]
        result3 = solution.twoSumUsingMap(numbers3, target3);
        System.out.println("Test case 3, Expected: [1,2]  Result: [" + result3[0] + "," + result3[1] + "]"); // Expected: [1,2]


    }
}
