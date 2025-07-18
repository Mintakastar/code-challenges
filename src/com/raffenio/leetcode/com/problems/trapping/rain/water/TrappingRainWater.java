package com.raffenio.leetcode.com.problems.trapping.rain.water;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/trapping-rain-water/
 */
public class TrappingRainWater {
    public static void main(String[] args) {
        TrappingRainWaterSolution solution = new TrappingRainWaterSolution();

        //** * Test cases for the brute force solution
        System.out.println("Test cases for the brute force solution\n");
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int result = solution.trapBruteForce(height);
        System.out.println("Trapped rain water: " + result + "  <-> 6 As Expected output"); // Expected output: 6

        int[] height2 = {4,2,0,3,2,5};
        int result2 = solution.trapBruteForce(height2);
        System.out.println("Trapped rain water: " + result2 + "  <-> 9 As Expected output"); // Expected output: 9


        int[] height3 =getLongTestCaseValues();
        int result3 = solution.trapBruteForce(height3);
        System.out.println("Trapped rain water: " + result3 + "  <-> 0 As Expected output"); // Expected output: 0

        int[] height4 = {4,2,3};
        int result4 = solution.trapBruteForce(height4);
        System.out.println("Trapped rain water: " + result4 + "  <-> 1 As Expected output"); // Expected output: 9





        //** * Test cases for the left pointer solution
        System.out.println("\n\nTest cases for left pointer solution\n");
        int[] height5 = {0,1,0,2,1,0,1,3,2,1,2,1};
        int result5 = solution.trapLeftPointer(height5);
        System.out.println("Trapped rain water: " + result5 + "  <-> 6 As Expected output"); // Expected output: 6

        int[] height6 = {4,2,0,3,2,5};
        int result6 = solution.trapLeftPointer(height6);
        System.out.println("Trapped rain water: " + result6 + "  <-> 9 As Expected output"); // Expected output: 9


        int[] height7 =getLongTestCaseValues();
        int result7 = solution.trapLeftPointer(height7);
        System.out.println("Trapped rain water: " + result7 + "  <-> 0 As Expected output"); // Expected output: 0

        int[] height8 = {4,2,3};
        int result8 = solution.trapLeftPointer(height8);
        System.out.println("Trapped rain water: " + result8 + "  <-> 1 As Expected output"); // Expected output: 9


    }


    private static int[] getLongTestCaseValues(){
        List<Integer> heightList = new ArrayList<>();
        try {
            try (BufferedReader reader = new BufferedReader(new FileReader("src/com/raffenio/leetcode/com/problems/trapping/rain/water/longTestCase.txt"))) {

                String line;
                while ((line = reader.readLine()) != null) {
                    for (String val : line.split(",")) {
                        heightList.add(Integer.parseInt(val.trim()));
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        int[] height = heightList.stream().mapToInt(i -> i).toArray();
        return height;
    }
}
