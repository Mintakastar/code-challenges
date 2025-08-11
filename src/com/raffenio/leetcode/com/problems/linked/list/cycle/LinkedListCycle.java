package com.raffenio.leetcode.com.problems.linked.list.cycle;

/**
 * This is the solution of https://leetcode.com/problems/linked-list-cycle/
 */
public class LinkedListCycle {
    public static void main(String[] args) {
        LinkedListCycleSolution solution = new LinkedListCycleSolution();
        // Test cases for the linked list cycle problem
        ListNode head1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);
        head1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = head1;
        System.out.println("Test case 1, Expected: true  Result: " + solution.hasCycleMapAndRecursive(head1)); // Expected: true


        ListNode head5 = new ListNode(3);
        ListNode node6 = new ListNode(2);
        ListNode node7 = new ListNode(0);
        ListNode node8 = new ListNode(-4);
        head5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = null;
        System.out.println("Test case 2, Expected: false  Result: " + solution.hasCycleMapAndRecursive(head5)); // Expected: false


    }
}
