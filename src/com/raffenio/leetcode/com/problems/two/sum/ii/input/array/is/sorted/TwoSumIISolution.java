package com.raffenio.leetcode.com.problems.two.sum.ii.input.array.is.sorted;

import java.util.HashMap;
import java.util.Map;

public class TwoSumIISolution {

    /*
    * Runtime 2    ms   Beats 92.76%
    * Memory 47.42 MB   Beats 27.47%
    *
    * Explanation video:
    * https://www.youtube.com/shorts/chKk9gszrlU
    * */
    public int[] twoSumUsingTwoPointer(int[] numbers, int target) {
        /*//my test TWO pointer
            0 1 2  3 4
           [2,3,7,11,15], target = 9
            l         r

        */
        int l=0;
        int r = numbers.length-1;

        while(l<r){
            if( numbers[l]+numbers[r] == target){
                return new int[]{l+1,r+1};
            }else if( numbers[l]+numbers[r] < target){ //increment left
                l++;
            }else{ // l+r is higher decrement right
                r--;
            }
        }
        return new int[]{l+1,r+1};
    }

    /*
     * Runtime 8 ms Beats 10.25%
     * Memory 48.32 MB Beats 6.80%
     * */
    public int[] twoSumUsingMap(int[] numbers, int target) {
        /*//my test
            0 1 2  3 4
           [2,3,7,11,15], target = 9
            i

            MAP:
            key
            second       index
            "7"     ->     "0"
            "6"     ->     "1"
            7 is found return 0 + current which is 2
        */
        int[] result = new int[2];
        Map<String,Integer> map = new HashMap<>();
        for(int i=0; i<numbers.length ; i++){
            if(map.containsKey(String.valueOf(numbers[i]))){
                result[0] = map.get(String.valueOf(numbers[i]))+1;
                result[1] = i+1;
                return result;
            }else{
                int secondNumber = target - numbers[i];
                map.put( String.valueOf(secondNumber),i);
            }

        }
        return null;
    }
}