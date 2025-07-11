package com.raffenio.leetcode.com.problems.container.with.most.water;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        ContainerWithMostWaterSolution solution = new ContainerWithMostWaterSolution();

        System.out.println("One pointer moving onwards the end");
        int[] height = {1,8,6,2,5,4,8,3,7};
        int result = solution.maxAreaSolution01_timedOut(height);
        System.out.println("Max area: " + result + "  <-> 49 As Expected output"); // Expected output: 49

        int[] height2 = {1,1};
        int result2 = solution.maxAreaSolution01_timedOut(height2);
        System.out.println("Max area: " + result2 + "  <-> 1 As Expected output"); // Expected output: 1


        //it timed out with this value
        int[] height3 =  getLongValue3();

        int result3 = solution.maxAreaSolution01_timedOut(height3);
        System.out.println("Max area: " + result3 + "  <-> 705634720 As Expected output"); // Expected output: ?  // it gave 705634720 ,705634720

        System.out.println("\nTwo pointer moving to the center ( the one line that is lower)");

        result = solution.maxArea_twoPointers(height);
        System.out.println("Max area: " + result + "  <-> 49 As Expected output"); // Expected output: 49

        result2 = solution.maxArea_twoPointers(height2);
        System.out.println("Max area: " + result2 + "  <-> 1 As Expected output"); // Expected output: 1

        result3 = solution.maxArea_twoPointers(height3);
        System.out.println("Max area: " + result3 + "  <-> 705634720 As Expected output"); // Expected output: ?  // it gave 705634720 ,705634720

    }







    private static int[] getLongValue3(){
        List<Integer> heightList = new ArrayList<>();
        try {

            try (BufferedReader reader = new BufferedReader(new FileReader("src/com/raffenio/leetcode/com/problems/container/with/most/water/heigths3.txt"))) {

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
