package com.raffenio.leetcode.com.problems.valid.anagram;

//https://leetcode.com/problems/valid-anagram/
public class ValidAnagram {
    //write the main method to test the solution
    public static void main(String[] args) {
        ValidAnagramSolution solution = new ValidAnagramSolution();

        String s = "anagram";
        String t = "nagaram";

        String s2 = "rat";
        String t2 = "car";


        System.out.println(solution.isAnagramSorting(s, t)); //true
        System.out.println(solution.isAnagramSorting(s2, t2)); //false

        System.out.println(solution.isAnagramMaps(s, t)); //true
        System.out.println(solution.isAnagramMaps(s2, t2)); //false

        //best solution
        System.out.println(solution.isAnagramArrays(s, t)); //true
        System.out.println(solution.isAnagramArrays(s2, t2)); //false

    }
}
