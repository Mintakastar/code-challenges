package com.raffenio.open.algorithms.quicksort;

import com.raffenio.open.algorithms.Algorithm;

public class QuickSort extends Algorithm {

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();

        int[] input = new int[]{7, 1, 3, 2, 4, 5, 6};
        quickSort.quickSortAlgorithm(input);


        input = new int[]{73,15,73,91, 42,69,  21,95, 89};
        quickSort.quickSortAlgorithm(input);



    }

    public void quickSortAlgorithm(int[] arr){
        print("START");
        print(arr);

        //Call algorithm, sending whole array
        quickSort(arr, 0, arr.length-1);

        print("END");
        print(arr);

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

            //al salir de aqui quiere decir que el elemento final, es menor que el pivote, se intercambian entonces
            //el pivote y este elemento
            if(start != end ){ // hace un paso menos, por que al ser el mismo index, no se intercambia, solo para efectos de calcular el numero de intercambios
                int tmpEnd= arr[end];
                arr[end] =  arr[start] ;
                arr[start] = tmpEnd;
            }


            //TALVEZ
            //se incrementa el index de inicio, por que sabemos que es  menos al pivote  //TODO validar

            //ahora el pivote es el elemento final y se incrementa el index de inicio
            // validar izquierda
            while(arr[start] <= arr[end] &&  start < end){
                start ++ ;
            }
            if(start != end ) { // hace un paso menos, por que al ser el mismo index, no se intercambia, solo para efectos de calcular el numero de intercambios
                //se intercanbian el inicio y fin ,
                int tmpEnd = arr[end];
                arr[end] = arr[start];
                arr[start] = tmpEnd;
                //TALVEZ
                //se decrementa el index de fin, por que sabemos que es  mayor al pivote  //TODO validar
            }

        }

        return start; //o el final , es lo mismo
    }

}
