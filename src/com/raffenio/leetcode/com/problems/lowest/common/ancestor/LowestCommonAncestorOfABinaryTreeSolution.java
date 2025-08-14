package com.raffenio.leetcode.com.problems.lowest.common.ancestor;


import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class LowestCommonAncestorOfABinaryTreeSolution {
///*TrackPaths*/
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //find first node and track the path
        //find second node and track the path
        //return the common element in both arrays.
        //case 1
        // 3 1
        // 3 5
        // ^

        //case 2
        // 3 5
        // 3 5 2 4
        //   ^

        //case 3
        // 1
        // 1 2
        // ^

        //my case 6 and 4
        //6->   3 5 6
        //4->   3 5 2 4
        //        ^

        //New case 6 and 101
        //[3, 5,1,   6,2,0,8,  null,null,7,4,null,null,null,null,100,101]
        // 3 5 6
        // 3 5 2 7 101


        //New case 6 and 8
        //[3, 5,1,   6,2,0,8,  null,null,7,4,null,null,null,null,100,101]
        // 3 5 6
        // 3 1 8

        //error test case : [37,-34,-48,null,-100,-101,48,null,null,null,null,-54,null,-71,-22,null,null,null,8]
        //p=-71
        //q= 48
        //expected -48

        List<TreeNode> pathP = new ArrayList<>();
        List<TreeNode> pathQ = new ArrayList<>();

        findPath(root, p, pathP);
        findPath(root, q, pathQ);

        //uncomment for debugging
/*
            pathP.forEach(n -> System.out.print(n.val+" "));
            System.out.println();
            pathQ.forEach(n -> System.out.print(n.val+" "));
            System.out.println();
*/
        TreeNode lca=null;
        int iP = pathP.size() -1;
        int iQ = pathQ.size() -1;

        while( iP >= 0 && iQ >= 0 &&  pathP.get(iP) == pathQ.get(iQ)){
            lca = pathP.get(iP);
            iP--;
            iQ--;
        }
        return lca;
    }

    public boolean findPath(TreeNode current, TreeNode toFind, List<TreeNode> path){
        if(current == null) return false;

        //path.add(current);

        if( current == toFind){
            path.add(current);
            return true;
        }else{
            boolean found = findPath(current.right, toFind, path);
            if(found) {
                path.add(current);
                return true;
            }
            found = findPath(current.left, toFind, path);
            if(found) {
                path.add(current);
                return true;
            }
            return false;
        }
    }
}









