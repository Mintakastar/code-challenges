package com.raffenio.leetcode.com.problems.lowest.common.ancestor;

/**
 * Exercise https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
 *
 * Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.
 * According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between
 * two nodes p and q as the lowest node in T that has both p and q as descendants
 * (where we allow a node to be a descendant of itself).”
 *
 * Example 1:
 * Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
 * Output: 3
 * Explanation: The LCA of nodes 5 and 1 is 3.
 *
 * Example 2:
 * Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
 * Output: 5
 * Explanation: The LCA of nodes 5 and 4 is 5, since a node can be a descendant of itself according to the LCA definition.
 *
 * Example 3:
 * Input: root = [1,2], p = 1, q = 2
 * Output: 1
 *
 * Constraints:
 * The number of nodes in the tree is in the range [2, 105].
 * -109 <= Node.val <= 109
 * All Node.val are unique.
 * p != q
 * p and q will exist in the tree.
 *
 */
public class LowestCommonAncestorOfABinaryTree {
    public static void main(String[] args) {
        //write a test
        LowestCommonAncestorOfABinaryTreeSolution solution = new LowestCommonAncestorOfABinaryTreeSolution();

        // You can create a binary tree and test the solution here
        // Example:
        TreeNode root = new TreeNode(3);
        TreeNode p = new TreeNode(5);
        TreeNode q = new TreeNode(1);
        root.left = p;
        root.right = q;

        System.out.println("Expected 3, result: " + solution.lowestCommonAncestor(root, p, q).val); // Expected output: 3


        //[3,    5,1,     6,2,0,8,     null,null,7,4]
        TreeNode n3Root = new TreeNode(3); //es el root

        TreeNode n5 = new TreeNode(5);
        TreeNode n1 = new TreeNode(1);

        TreeNode n6 = new TreeNode(6);
        TreeNode n2 = new TreeNode(2);
        TreeNode n0 = new TreeNode(0);
        TreeNode n8 = new TreeNode(8);

        TreeNode n7 = new TreeNode(7);
        TreeNode n4 = new TreeNode(4);


        n1.right = n8;
        n1.left = n0;

        n2.right = n4;
        n2.left = n7;

        n5.right = n2;
        n5.left = n6;

        n3Root.right = n1;
        n3Root.left = n5;

        System.out.println("Expected 3, result: " + solution.lowestCommonAncestor(n3Root, n5,n1).val); // Expected output: 3
        System.out.println("Expected 5, result: " + solution.lowestCommonAncestor(n3Root, n5,n4).val); // Expected output: 3


        //TODO add the case with no tracking paths, just return the first common ancestor found

    }

}
