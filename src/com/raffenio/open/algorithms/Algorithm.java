package com.raffenio.open.algorithms;

public class Algorithm {
    protected void println(String msg){
        System.out.println(msg);
    }
    protected void print(String msg){
        System.out.print(msg);
    }
    protected void print(int arr[]){
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ]");
    }
}
