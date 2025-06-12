package com.raffenio.hackerrank.com.challenges.one.week.preparation.kit.lonely.integer;


import com.raffenio.base.SolutionBase;

import java.util.List;

public class Solution {

    /*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */
    public static int lonelyintegerSorting(List<Integer> a) {
        System.out.println("Sorting Algorithm");
        a.sort(Integer::compareTo);
        for (int i = 0; i < a.size(); i++) {
            if(i==a.size()-1){
                return a.get(i);
            }
            if( a.get(i) != a.get(i+1)){
                return a.get(i);
            }else{
                i++; // skip the next one since it's the same
            }
        }
        return -1;
    }


    /*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */
    public static int lonelyintegerIndex(List<Integer> a) {
        System.out.println("Index Algorithm");

        for (int i = 0; i < a.size(); i++) {
            //if the last and first index are the same, it means there is only one occurrence
           if(a.indexOf(a.get(i)) == a.lastIndexOf(a.get(i))){
               return a.get(i);
           }
        }
        return -1;
    }
}





