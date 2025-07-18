package com.raffenio.leetcode.com.problems.trapping.rain.water;
/**
 * https://leetcode.com/problems/trapping-rain-water/
 */
public class TrappingRainWaterSolution {


    /**
     * Time Limit Exceeded
     * @param height
     * @return
     */
    public int trapBruteForce(int[] height) {
        int max= getMax(height);
        int waterCount=0;

        for(int i=0; i< max;i++){
            lessOne(height);
            waterCount += countWater(height);

        }

        return waterCount;
    }

    private int  getMax(int[] height){
        int max=0;
        for(int i=0; i<height.length;i++){
            max = Math.max(height[i],max);
        }
        return max;
    }

    private void lessOne(int[] height){
        for(int i=0; i<height.length;i++){
            height[i]--;
        }
    }

    private int countWater(int[] height){
        int waterCount = 0;

        int left=-1;
        int rigth=-1;

        for(int i=0; i<height.length;i++){
            if(height[i]>=0){
                left = i;
                break;
            }
        }
        for(int i=height.length-1 ; i >= 0 ; i--){
            if(height[i]>=0){
                rigth = i;
                break;
            }
        }
        if(left>=0 && rigth >=0){
            for(int i=left; i<=rigth ; i++){

                if(height[i]<0){
                    waterCount++;
                }

            }
        }
        return waterCount;

    }


    /**
     * Left pointer soultion , this passed
     * Runtime
     * 351 ms  Beats 5.84%
     *
     * Memory
     * 46.62 MB      Beats  28.17%
     *
     * Time Complexity   O(N2)
     * Space Complexity  O(1)
     *
     * @param height
     * @return
     */
    public int trapLeftPointer(int[] height) {
        int waterCount=0;

        int left = 0;
        int rigth = 1;

        while( rigth < height.length  ){
            if( height[rigth] >= height[left] ){
                //count water
                int with = (rigth - left)-1;
                int heigh = Math.min( height[rigth] , height[left]);

                int area = with*heigh;

                int ground = getGround(height,left,rigth);

                int water = area - ground;
                waterCount +=water;

                left = rigth;
                rigth = left+1;

            }else{
                rigth++;
                if(rigth  >=  height.length ){ //overflow
                    // no encontro algun valor mas chico
                    height[left]--;
                    rigth = left+1;

                    if(height[left] == 0 ||left ==height.length-2 ){break;}
                }
            }
        }

        return waterCount;
    }//trap


    public int getGround(int[] height, int left,int rigth){
        int ground=0;
        for(int i=left+1; i<rigth;i++){
            ground += height[i];
        }
        return ground;
    }
}