package com.raffenio.open.algorithms.bubbleSort;

import com.raffenio.open.algorithms.Algorithm;

public class BubbleSort extends Algorithm {
    public static void main(String[] args) {

        BubbleSort bubbleSort = new BubbleSort();

        int[] example1 = bubbleSort.bubbleSortAlgorithm(new int[]{7, 1, 3, 2, 4, 5, 6});
    }




    public int[] bubbleSortAlgorithm(int[] arr){
        print("START");
        print(arr);

        int length = arr.length;
        for (int i = 0; i < length; i++) { // loop all the array
            for (int j = 0; j < length - i - 1; j++) {

                println("Validate if ["+j+"] "+arr[j]+" > ["+(j + 1)+"] "+arr[j + 1]);

                if (arr[j] > arr[j + 1]) {
                    print(arr);
                    // swap arr[j+1] and arr[j]
                    println("\tSwap ["+j+"] "+arr[j]+" with ["+(j + 1)+"] "+arr[j + 1]);
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    print(arr);
                    println("");
                }
            }
        }

        print("END");
        print(arr);
        return arr;
    }



   /* bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }*/



}
