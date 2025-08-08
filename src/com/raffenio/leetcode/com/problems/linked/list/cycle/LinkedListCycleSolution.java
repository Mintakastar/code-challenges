package com.raffenio.leetcode.com.problems.linked.list.cycle;
import java.util.HashMap;
import java.util.Map;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class LinkedListCycleSolution {


    /**
     * Runtime : 8 ms
     * Beats   : 7.25%
     * Analyze Complexity  O(n)
     *
     * Memory : 46.83 MB
     * Beats  : 6.71%
     * Analyze Complexity  O(n)
     *
     * @param head
     * @return
     */
    public boolean hasCycleFastest(ListNode head) {
        int pos=0;

        if(head == null){
            pos = -1;
            return false;
        }

        Map< ListNode,String> map = new HashMap<>();



        pos=goToNext(head,map, pos);

        return pos>=0;
    }
//   x
//[3,2,0,-4]
// 0 1 2  3
//   4

    public int goToNext(ListNode node,Map<ListNode,String> map, int pos ){

        //String key = node.val+"";
        String val = node.val+"";
        ListNode key = node;

        if(map.containsKey(key) /*&& map.get(key) == node*/){
            return pos;
        }else{
            //map.put(key, node);
            map.put(key, val);
        }

        if(node.next != null ){
            return goToNext(node.next,map, pos+1 );
        }else{
            // no cycle
            return -1;
        }
        // return -2;
    }


}