package com.raffenio.leetcode.com.problems.valid.anagram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagramSolution {
/*
    //TODO make this better
    Runtime 11      ms             Beats 29.55%
    Memory  47.23   MB             Beats 5.23%

*/
    public boolean isAnagramSorting(String s, String t) {
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);

        return Arrays.toString(sChar).equals(Arrays.toString(tChar));
    }

    /*
    * This is worse
    *   Runtime 16    ms Beats 21.22%
    *    Memory  46.64 MB Beats 5.23%
     * */
    public boolean isAnagramMaps(String s, String t) {

        Map<String, Integer> validator = new HashMap<>();

        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        for(int i =0; i<sChar.length; i++){
            char cur = sChar[i];
            validator.merge(""+cur,1,Integer::sum);
        }

        for(int i =0; i<tChar.length; i++){
            char cur = tChar[i];
            validator.merge(""+cur,-1,Integer::sum);
        }

        for(Map.Entry<String,Integer> entry: validator.entrySet()){
            if(entry.getValue() != 0){
                return false;
            }
        }
        return true;
    }

    /**
     * this is the best solution
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagramArrays(String s, String t) {
        int[] abc = new int[26];//total numbers of characters of the english alphabeth

        //add the frequency of the characters of the first string
        for(char c : s.toCharArray()){
            abc[c-'a']++; // index based position of the int value of the character
        }

        //remove the frequency of the characters of the second string
        for(char c : t.toCharArray()){
            abc[c-'a']--; // index based position of the int value of the character
        }

        //all values should be zero 0, to be a valid anagram,
        //all characters apearance in the first string
        //should be removed in the second string, and the result is zero, to be valid
        for(int i=0; i < abc.length ; i++){
            if( abc[i]!=0 ){
                return false;
            }
        }
        //the elements were never 0, so , return true.
        return true;
    }
}

