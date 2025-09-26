package com.raffenio.leetcode.com.problems.three3sum;

import java.util.*;

public class Three3SumSolution {
    /**
     * This is the solution of https://leetcode.com/problems/3sum/
     */
    public List<List<Integer>> threeSum(int[] nums) {
        /*
            [-1,0,1,2,-1,-4]
              p l         r
        */
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);

        // p -> will move one to one , once all the rest of the array is validated completely
        // l -> will increase if the sum is less or equal to 0
        // r -> will decrease if the sum is more or iqual to 0

        for(int p = 0 ; p< nums.length-2 ; p++){

            //This "if" block reduces the runtime from 1014ms to 43ms as follows:
            //  Runtime 1014 ms Beats  7.56% 	Memory 52.48 MB Beats 22.31%
            //  Runtime   43 ms Beats 23.82%    Memory 51.70 MB Beats 46.47%
            if(p>0 && nums[p-1] == nums[p]){
                continue;
            }

            int l =p+1; // will be the start of the sub array
            int r= nums.length-1; //will be the end of the sub array

            while(l<r){
                int sum = nums[p] + nums[l] + nums[r];
                if(sum == 0){
                    //System.out.println( nums[p] +" , "+ nums[l] +" , "+ nums[r]);
                    List<Integer> list = Arrays.asList(nums[p] , nums[l] , nums[r]);
                    list.sort(null );
                    result.add(list);
                    l++;
                    r--;
                }else if(sum < 0){ //increment l
                    l++;
                }else{// sum is greater than 0, decrement r
                    r--;
                }
            }//end while
        }//end for

        return new ArrayList<>(result);
    }
}