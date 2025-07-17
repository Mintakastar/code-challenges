package com.raffenio.leetcode.com.problems.container.with.most.water;

public class ContainerWithMostWaterSolution {

    /*works but it timed out in some case*/
    public int maxAreaOnePointerTimedOut(int[] height) {
        int max=-1;

        //[1,8,6,2,5,4,8,3,7] //9 elements/length
        // 0 1 2 3 4 5 6 7 8  //
        //             i
        //                j

        int i=0; //the one i will try against all the other heigths
        int j=1; //the one i will validate against i
        int iMax=height[0];//to fix time out?
        while( i < height.length -1 ){

            int withValue = j-i;
            int heigthValue=-1;

            if( height[i] < height[j] ){
                heigthValue = height[i];
            }else{
                heigthValue = height[j];
            }
            int maxTmp = withValue * heigthValue;

            if( maxTmp > max ){
                max = maxTmp;
            }

            j++;

            if( j == height.length ){
                i++;

                //to fix time out?
                while( i < height.length  && height[i] < iMax  ){
                    i++;
                }
                //reset j to the next element after i
                j=i+1;
            }
        }

        return max;
    }

    /*
    * using to pointers, one to the left and one to the right
    * this is the best solution, it works in O(n) time complexity
    * it does not time out
    * * The idea is to use two pointers, one at the beginning and one at the end of the array.
    *  the pointer which points to the shorter line is moved inward, because the area is limited by the shorter line.
    * */
    public int maxAreaTwoPointers(int[] height) {
        int max=-1;

        //[1,8,6,2,5,4,8,3,7] //9 elements/length
        // 0 1 2 3 4 5 6 7 8  //
        // i
        //                 j

        int i=0; //the one i will try against all the other heigths
        int j=height.length -1; //the one i will validate against i

        while( i<j   /*i < height.length -1*/ ){

            int withValue = j-i;
            int heigthValue=-1;

            if( height[i] < height[j] ){ // i is the lower line
                heigthValue = height[i];
                i++;
            }else{ // j is the lower line
                heigthValue = height[j];
                j--;
            }

            int maxTmp = withValue * heigthValue;

            if( maxTmp > max ){
                max = maxTmp;
            }
        }

        return max;
    }
}
