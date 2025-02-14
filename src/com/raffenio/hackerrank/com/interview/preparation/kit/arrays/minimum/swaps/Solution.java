package com.raffenio.hackerrank.com.interview.preparation.kit.arrays.minimum.swaps;

/**
 * You are given an unordered array consisting of consecutive integers  [1, 2, 3, ..., n] without any duplicates.
 * You are allowed to swap any two elements. Find the minimum number of swaps required to sort the array in ascending order.
 *
 * Example
 *  ("Example 1:");
 *  "Input: "+ "[7, 1, 3, 2, 4, 5, 6]");
 *
 * Perform the following steps:
 *
 * i   arr                         swap (indices)
 * 0   [7, 1, 3, 2, 4, 5, 6]   swap (0,3)
 * 1   [2, 1, 3, 7, 4, 5, 6]   swap (0,1)
 * 2   [1, 2, 3, 7, 4, 5, 6]   swap (3,4)
 * 3   [1, 2, 3, 4, 7, 5, 6]   swap (4,5)
 * 4   [1, 2, 3, 4, 5, 7, 6]   swap (5,6)
 * 5   [1, 2, 3, 4, 5, 6, 7]
 *
 * It took  swaps to sort the array.
 *
 * Function Description
 *
 * Complete the function minimumSwaps in the editor below.
 *
 * minimumSwaps has the following parameter(s):
 *
 * int arr[n]: an unordered array of integers
 * Returns
 *
 * int: the minimum number of swaps to sort the array
 * Input Format
 *
 * The first line contains an integer, , the size of .
 * The second line contains  space-separated integers .
 *
 * Constraints
 *
 * Sample Input 0
 * 4
 * 4 3 1 2
 * Sample Output 0
 * 3
 * Given array
 * After swapping  we get
 * After swapping  we get
 * After swapping  we get
 * So, we need a minimum of  swaps to sort the array in ascending order.
 */
public class Solution {

    public enum SortAlgorithm{
        BUBBLE,
        QUICK,
        SOLUTION
    }

    public SortAlgorithm selectedAlgorithm=SortAlgorithm.QUICK;

    private static boolean debug=true;
    /**
     *
     * @param arr
     * @return
     */
    int swapNum= -1;
    int sameIndexCount=-1;
    public int minimumSwaps(int[] arr) {

        //int caseSelected = 1; //bubble
        int caseSelected = 2; //quick sort

        switch (selectedAlgorithm){
            case BUBBLE:
                //USING  Bubble sort algorithm
                println("BUBBLE SORT:");
                print("INPUT:"+arr);
                swapNum=this.bubbleSortAlgorithm(arr);
                print("OUTPUT:"+arr);
                println("SWAP NUM:"+swapNum);
                break;
            case QUICK:
                println("QUICK SORT:");
                print("INPUT:"+arr);
                print(arr);
                swapNum=0;
                sameIndexCount=0;
                int lastIndex = quickSort(arr, 0, arr.length-1);

                print("OUTPUT:");
                print(arr);
                println("SWAP NUM:"+swapNum);
                println("sameIndexCount NUM:"+sameIndexCount);
                break;
            case SOLUTION:
                println("SOLUTION:");
                print("INPUT:"+arr);
                print(arr);
                swapNum=0;
                swapNum = solutionMinimumSwaps(arr);

                print("OUTPUT:");
                print(arr);
                println("SWAP NUM:"+swapNum);
                break;

        }




        return swapNum;
    }

    /*
    * I saw this solution here
    * https://www.youtube.com/watch?v=JispxxyIxfc
    * */
    public int solutionMinimumSwaps(int[] arr){
       int swaps = 0, index=0, tmp;

       while(index < arr.length){
           if(arr[index] != index+1){
               // 0  1  2  3  4  5  6
               // 7  1  3  2  4  5  6
               tmp = arr[index];
               arr[index] =  arr[arr[index]-1];
               arr[tmp-1] = tmp;
                swaps++;
           }else{
               index++;
           }
       }

        /*

        //Codigo generado por copilot:
        //es lo mismo pero hace la asignacion de forma inversa.

        while(index < arr.length){
            if(arr[index] != index+1){
                tmp = arr[arr[index]-1];
                arr[arr[index]-1] = arr[index];
                arr[index] = tmp;
                swaps++;
            }else{
                index++;
            }
        }

        */

        return swaps;
    }



    /**
     *  https://es.wikipedia.org/wiki/Ordenamiento_de_burbuja
     *  https://www.geeksforgeeks.org/bubble-sort-algorithm/
     *      Complexity Analysis of Bubble Sort:
     *      Time Complexity: O(n2)
     *      Auxiliary Space: O(1)
     * @param arr
     * @return
     */
    public int bubbleSortAlgorithm(int[] arr){
        print("START");
        print(arr);
        int swapNum=0;
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
                    swapNum++;;
                    print(arr);
                    println("");
                }
            }
        }

        print("END");
        print(arr);
        return swapNum;
    }






    /**
     * @see
     * https://www.youtube.com/watch?v=YzHDIvxOQcI
     *
     * @param arr
     * @param start
     * @param end
     * @return
     */
    public int quickSort(int[] arr, int start, int end){

        if(start<end){
            //localizar pivote
            int pivoteIndex=placePivot(arr,  start, end);
            //izquierda
            quickSort(arr, start, pivoteIndex-1);

            //derecha
            quickSort(arr, pivoteIndex+1, end);

        }

        return start;// end can be returned too, as start and end are the same
    }

    private int placePivot(int[] arr, int start, int end){
        //mientras existan elementos sin procesar
        //se tiene que checar a izquierda y luego a derecha
        while( start < end ){

            // se toma como pivote el inicio del arreglo
            //se puede tomar cualquier otro valor, el final, o un valor aleatorio en el medio.
            //int pivotIndex = start;


            //validar derecha
            //mientras el elemento fin ( index marcado como fin) sea mayor o igual al elemento pivote (el elemento inicial de la lista)
            while(arr[end] >= arr[start] && start < end){
                //se decrementa el index fin
                end--;
            }

            if(start == end){
                sameIndexCount++;
                println("...Indices : END "+end+" , START "+start);
                println("...Derecha mismos indices END "+end+" = ["+arr[end]+"] , START "+start+" = ["+arr[start]+"]  , sameIndexCount: "+sameIndexCount);
            }
            if(start != end ){
                //al salir de aqui quiere decir que el elemento final, es menor que el pivote, se intercambian entonces
                //el pivote y este elemento
                println("\nDerecha: Cambiar:");// index END "+end+" valor ["+arr[end]+"] con index START "+start+" valor ["+arr[start]+"]");
                println("Indices : END "+end+" con START "+start);
                println("Valores : END  ["+arr[end]+"]  con START ["+arr[start]+"]");
                print("Antes: ");
                print(arr);
                int tmpEnd= arr[end];
                arr[end] =  arr[start] ;
                arr[start] = tmpEnd;
                swapNum++;
                print("Despu: ");
                print(arr);
                println("Indices : END "+end+" , START "+start);
            }




            //TALVEZ
            //se incrementa el index de inicio, por que sabemos que es  menos al pivote  //TODO validar

            //ahora el pivote es el elemento final y se incrementa el index de inicio
            // validar izquierda
            while(arr[start] <= arr[end] &&  start < end){
                start ++ ;
            }

            if(start == end){
                sameIndexCount++;
                println("...Indices : END "+end+" , START "+start);
                println("...Izquierda mismos indices END "+end+" = ["+arr[end]+"] , START "+start+" = ["+arr[start]+"], sameIndexCount: "+sameIndexCount);
            }

            if(start != end ){
                println("\nIzquierda: Cambiar:");// index END "+end+" valor ["+arr[end]+"] con index START "+start+" valor ["+arr[start]+"]");
                println("Indices : END "+end+" con START "+start);
                println("Valores : END  ["+arr[end]+"]  con START ["+arr[start]+"]");
                print("Antes: ");
                print(arr);

                //se intercanbian el inicio y fin ,
                int tmpEnd= arr[end];
                arr[end] =  arr[start] ;
                arr[start] = tmpEnd;
                swapNum++;
                print("Despu: ");
                print(arr);
                println("Indices : END "+end+" , START "+start);
                //TALVEZ
                //se decrementa el index de fin, por que sabemos que es  mayor al pivote  //TODO validar

            }


        }

        return start; //o el final , es lo mismo
    }













    static void println(String msg){
        if(!debug)return;
        System.out.println(msg);
    }
    static void print(String msg){
        if(!debug)return;

        System.out.print(msg);
    }
    static void print(int arr[]){
        if(!debug)return;

        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ]");
    }

}





