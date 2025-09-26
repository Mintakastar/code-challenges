package com.raffenio.leetcode.com.problems.best.time.to.buy.and.sell.stock.ii;

/**
 * This is the solution of https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 */
public class BestTimeToBuyAndSellStockii {
    public static void main(String[] args) {
        BestTimeToBuyAndSellStockiiSolution solution = new BestTimeToBuyAndSellStockiiSolution();

        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Test case 1, Expected: 7  Result: " + solution.maxProfit(prices1)); // Expected: 7

        int[] prices2 = {1, 2, 3, 4, 5};
        System.out.println("Test case 2, Expected: 4  Result: " + solution.maxProfit(prices2)); // Expected: 4

        int[] prices3 = {7, 6, 4, 3, 1};
        System.out.println("Test case 3, Expected: 0  Result: " + solution.maxProfit(prices3)); // Expected: 0

        int[] prices5 = {3, 3, 5, 0, 0, 3, 1, 4};
        System.out.println("Test case 5, Expected: 8  Result: " + solution.maxProfit(prices5)); // Expected: 8

        int[] prices6 = {1, 2};  //wrong case I got
        System.out.println("Test case 6, Expected: 1  Result: " + solution.maxProfit(prices6)); // Expected: 1
    }
    //TODO search for other options in YT
}
