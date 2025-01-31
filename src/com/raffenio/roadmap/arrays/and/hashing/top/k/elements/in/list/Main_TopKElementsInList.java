package com.raffenio.roadmap.arrays.and.hashing.top.k.elements.in.list;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Main_TopKElementsInList
 * https://neetcode.io/problems/top-k-elements-in-list
 */
public class Main_TopKElementsInList {



    public static void main(String[] args) {

        Solution solution = new Solution();

        /* *
         * Example 1:
         * Input: nums = [1,2,2,3,3,3], k = 2
         * Output: [2,3]
         **
         */



        int[] example1 = solution.topKFrequent(new int[]{1,2,2,3,3,3}, 2);
        System.out.println("Example 1:");
        System.out.println("Input: "+ Arrays.toString(new int[]{1,2,2,3,3,3}) + " k = 2");
        System.out.println("Output:  [2,3] ");

        Arrays.stream(example1).forEach(System.out::println);

         /*
         * Example 2:
         * Input: nums = [7,7], k = 1
         * Output: [7]
         *
         * */
        int[] example2 = solution.topKFrequent(new int[]{7,7}, 1);
        System.out.println("Example 2:");
        System.out.println("Input: "+ Arrays.toString(new int[]{7,7}) + " k = 1");
        System.out.println("Output: : [7] ");
        Arrays.stream(example2).forEach(System.out::println);


    }
}



/**
 * Top K Frequent Elements
 * Given an integer array nums and an integer k, return the k most frequent elements within the array.
 * The test cases are generated such that the answer is always unique.
 * You may return the output in any order.
 *
 * Example 1:
 * Input: nums = [1,2,2,3,3,3], k = 2
 * Output: [2,3]
 *
 * Example 2:
 * Input: nums = [7,7], k = 1
 * Output: [7]
 *
 * Constraints:
 *
 * 1 <= nums.length <= 10^4.
 * -1000 <= nums[i] <= 1000
 * 1 <= k <= number of distinct elements in nums.
 *
 * Recommended Time & Space Complexity
 * You should aim for a solution with O(n) time and O(n) space, where n is the size of the input array.
 *
 * Hint 1
 * A naive solution would be to count the frequency of each number and then sort the array based on each element’s frequency.
 * After that, we would select the top k frequent elements. This would be an O(nlogn) solution.
 * Though this solution is acceptable, can you think of a better way?
 *
 * Hint 2
 * Can you think of an algorithm which involves grouping numbers based on their frequency?
 *
 * Hint 3
 * Use the bucket sort algorithm to create n buckets, grouping numbers based on their frequencies from 1 to n.
 * Then, pick the top k numbers from the buckets, starting from n down to 1.
 */
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        return topKFrequentFirst(nums,k) ;
    }
    public int[] topKFrequentFirst(int[] nums, int k) {
        Map<String,Integer> map = new HashMap<>();


        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i]+"")){
                map.put(nums[i]+"", (int)map.get(nums[i]+"")+1);
            }else{
                map.put(nums[i]+"", 1);
            }
        }

        List<Map.Entry<String,Integer>> list = map.entrySet()
                .stream()
                .collect(Collectors.toList());


        list.sort( ( (Map.Entry<String,Integer> o1,Map.Entry<String,Integer> o2)-> o2.getValue().compareTo(o1.getValue())   ) );
      //  System.out.println(list);

        List list2=list.stream()
                        .map(entry->entry.getKey()).limit(k).collect(Collectors.toList());
       // System.out.println(list2);


       int arr[]= new int[k];
        for (int i = 0; i < k; i++) {
            arr[i]=Integer.parseInt(list2.get(i).toString());
        }
        return arr;




    }
}
