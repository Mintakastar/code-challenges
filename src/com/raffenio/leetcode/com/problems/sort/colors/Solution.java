package com.raffenio.leetcode.com.problems.sort.colors;

class Solution {
    public void sortColors_linealPass(int[] nums) {
        //ordered Red , White , Blue
        //         0      1       2
         /*
          i
          j
          0 1 2 3 4 5  length = 6      current color=100
         [0,0,1,1,2,2]

         [2,0,2,1,1,0]  //original array
         [0,0,1,1,2,2]  //sorted array

        */

        int currentColor=0;

        int i=0,j=0;

        while(i<nums.length ){

            //validate corner case
            //first element is fine
            if(i==j && nums[i] ==  currentColor){
                i++;
                j=i;
                continue;
            }

            //look for correct value to change
            if(nums[j] != currentColor){ //buscando el correcto
                j++;

                if(j==nums.length){//si llego al final del arreglo
                    currentColor++;
                    if(currentColor ==2){
                        break;
                    }
                    j=i;
                }
            }else{
                //change
                int jElement=   nums[j];
                nums[j] = nums[i] ; //move  the i element to the j position
                nums[i] = jElement; //place the j element to the i position

                i++;
                j=i;

            }
        }
    }//


    public void sortColors_2pointers(int[] nums) {
        //ordered Red , White , Blue
        //         0      1       2

     /*

          0 1 2 3 4 5  length = 6      current color=100
         [0,0,1,1,2,2]
              p p
              i


         [2,0,2,1,1,0]  //original array


    */

        int currentColor=0;

        int i=0,pointer0=0,pointer2=nums.length-1;

        while(i<nums.length ){
            //System.out.println("START: i: "+i+", pointer0: "+pointer0+", pointer2: "+pointer2+", nums: "+java.util.Arrays.toString(nums));

            //if the current element is 0
            if(nums[i] == 0){
                //swap with pointer0
                int temp = nums[pointer0];
                nums[pointer0] = nums[i];
                nums[i] = temp;
                pointer0++;
                i++;
            }else if(nums[i] == 2){ //PENDING

                //swap with pointer0
                int temp = nums[pointer2];
                nums[pointer2] = nums[i];
                nums[i] = temp;
                pointer2--;
            }else{
                //if the current element is 1, just move to the next element
                i++;
            }
            //System.out.println("END__: i: "+i+", pointer0: "+pointer0+", pointer2: "+pointer2+", nums: "+java.util.Arrays.toString(nums));
            //System.out.println();
            //if(pointer0==pointer2-1 ){break;} //if the pointers meet, we are done
            if(i>pointer2){break;}

        }

    }//


}