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
        System.out.println("Test case 1: " + solution.hasCycleFastest(head1)); // Expected: true



    }
}
