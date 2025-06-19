package com.raffenio.leetcode.com.problems.number.of.islands;

public class NumberOfIslands {
    public static void main(String[] args) {
        Solution s = new Solution();

       /* char[][] grid= {
                {' ',' ',' '},
                {' ',' ',' '},
                {' ',' ',' '},
        };*/


        char[][] grid1 = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };
        int result1 = s.numIslandsVisitAll(grid1);
        System.out.println("Number of islands in grid1: " + result1 + "  <-> 3 As Expected output"); // Expected output: 3


        char[][] grid2 = {
            {'1', '1', '1', '1', '0'},
            {'1', '1', '0', '1', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '0', '0', '0'}
        };
        int result2 = s.numIslandsVisitAll(grid2);
        System.out.println("Number of islands in grid2: " + result2 + "  <-> 1 As Expected output"); // Expected output: 3


        char[][] grid3 = {
                {   '1', '0', '1', '1', '1','0', '1', '1', '1', '1' },
                {   '1', '0', '1', '0', '1','0', '1', '0', '0', '1' },
                {   '1', '0', '1', '0', '0','0', '0', '0', '0', '1' },
                {   '1', '0', '1', '1', '1','1', '1', '1', '1', '1' },
                {   '1', '0', '1', '0', '0','0', '0', '0', '0', '1' },
                {   '1', '0', '1', '0', '1','0', '1', '0', '0', '1' },
                {   '1', '1', '1', '1', '1','0', '1', '1', '1', '1' }
        };
        int result3 = s.numIslandsVisitAll(grid3);
        System.out.println("Number of islands in grid3: " + result3 + "  <-> 1 As Expected output"); // Expected output: 3


    }
}
