package com.raffenio.leetcode.com.problems.number.of.islands;

/**
 * https://leetcode.com/problems/number-of-islands
 */
public class NumberOfIslands {
    public static void main(String[] args) {
        Solution s = new Solution();


                // yx  ij
        char[][] grid = {
                      // j
                {'1', '1', '0', '0', '0'},
          /*i*/ {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
        };

        //validate the length of the grid
        System.out.println("grid.length = " + grid.length);       //3
        System.out.println("grid[0].length = " + grid[0].length); //5




        System.out.println("ifs");

        char[][] grid1 = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };
        int result1 = s.numIslandsIfs(grid1);
        System.out.println("Number of islands in grid1: " + result1 + "  <-> 3 As Expected output"); // Expected output: 3


        char[][] grid2 = {
            {'1', '1', '1', '1', '0'},
            {'1', '1', '0', '1', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '0', '0', '0'}
        };
        int result2 = s.numIslandsIfs(grid2);
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
        int result3 = s.numIslandsIfs(grid3);
        System.out.println("Number of islands in grid3: " + result3 + "  <-> 1 As Expected output"); // Expected output: 3



        char[][] grid4 = {
                {'1','1','1'},
                {'0','1','0'},
                {'1','1','1'},
        };

        int result4 = s.numIslandsIfs(grid4);
        System.out.println("Number of islands in grid4: " + result4 + "  <-> 1 As Expected output"); // Expected output: 3









        System.out.println("try catch");
        char[][] grid5 = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        int result5 = s.numIslandsTryCatch(grid5);
        System.out.println("Number of islands in grid5: " + result5 + "  <-> 3 As Expected output"); // Expected output: 3


        char[][] grid6 = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        int result6 = s.numIslandsTryCatch(grid6);
        System.out.println("Number of islands in grid6: " + result6 + "  <-> 1 As Expected output"); // Expected output: 3


        char[][] grid7 = {
                {   '1', '0', '1', '1', '1','0', '1', '1', '1', '1' },
                {   '1', '0', '1', '0', '1','0', '1', '0', '0', '1' },
                {   '1', '0', '1', '0', '0','0', '0', '0', '0', '1' },
                {   '1', '0', '1', '1', '1','1', '1', '1', '1', '1' },
                {   '1', '0', '1', '0', '0','0', '0', '0', '0', '1' },
                {   '1', '0', '1', '0', '1','0', '1', '0', '0', '1' },
                {   '1', '1', '1', '1', '1','0', '1', '1', '1', '1' }
        };
        int result7 = s.numIslandsTryCatch(grid7);
        System.out.println("Number of islands in grid7: " + result7 + "  <-> 1 As Expected output"); // Expected output: 3



        char[][] grid8 = {
                {'1','1','1'},
                {'0','1','0'},
                {'1','1','1'},
        };

        int result8 = s.numIslandsTryCatch(grid8);
        System.out.println("Number of islands in grid8: " + result8 + "  <-> 1 As Expected output"); // Expected output: 3



    }
}
