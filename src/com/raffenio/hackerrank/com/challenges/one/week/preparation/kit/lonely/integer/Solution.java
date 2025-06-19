package com.raffenio.hackerrank.com.challenges.one.week.preparation.kit.lonely.integer;


import com.raffenio.base.SolutionBase;

import java.util.List;

public class Solution {

    /*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     *
         Time and Space Analysis, From ChatGPT

            📦 Complejidad Espacial (Space Complexity)
            a.sort(...) realiza ordenamiento in-place (si a es una ArrayList de Java), así que no usa espacio extra significativo.

            Solo se usan unas pocas variables temporales.

            ➡️ Complejidad espacial: O(1) (si el sort es in-place)

            ⏱️ Complejidad Temporal (Time Complexity)
            El paso principal es el ordenamiento:
                a.sort(Integer::compareTo);

            En Java, el método List.sort(...) usa un algoritmo de Timsort, con complejidad:

            ➤ O(n log n) en promedio y en el peor caso.

            El ciclo for que recorre la lista es lineal:
                  for (int i = 0; i < a.size(); i++) { ... }
                  *
            Como en cada iteración se avanza 1 o 2 posiciones, el número total de iteraciones sigue siendo O(n).

            ✅ Resumen
            Tipo de complejidad	Valor
            Tiempo	O(n log n)
            Espacio	O(1) (si sort es in-place)
     */
    public static int lonelyintegerSorting(List<Integer> a) {
        System.out.println("Sorting Algorithm");
        a.sort(Integer::compareTo);
        for (int i = 0; i < a.size(); i++) {
            if(i==a.size()-1){ // si llego al final
                return a.get(i);
            }
            if( a.get(i) != a.get(i+1)){  //si son diferentes
                return a.get(i);
            }else{
                i++; // skip the next one since it's the same
            }
        }
        return -1;
    }


    /*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     *
        Time and Space Analysis, From ChatGPT
            📦 Complejidad en Espacio (Space Complexity)
            El algoritmo no utiliza espacio adicional significativo, más allá de variables temporales (i, a.get(i)).

            Complejidad espacial: O(1) (constante), ya que no se crean estructuras adicionales como mapas, sets, listas, etc.

            ⏱️ Complejidad en Tiempo (Time Complexity)
            Veamos el punto crítico: este fragmento de código dentro del for:

            if (a.indexOf(a.get(i)) == a.lastIndexOf(a.get(i)))

            Análisis:
            a.get(i) → acceso O(1) en una lista como ArrayList.
            a.indexOf(x) → recorre la lista desde el inicio hasta encontrar x: O(n)
            a.lastIndexOf(x) → recorre la lista desde el final hasta encontrar x: O(n)

            Entonces, cada iteración del bucle hace dos recorridos de O(n), y el bucle completo se ejecuta hasta n veces en el peor caso.

            Resultado:
            Tiempo por iteración: O(n)
            Número de iteraciones: O(n)

            ➡️ Complejidad temporal total: O(n²)  ????

            ✅ Resumen
            Tipo de complejidad	Valor
            Tiempo	O(n²)
            Espacio	O(1)
     */
    public static int lonelyintegerIndex(List<Integer> a) {
        System.out.println("Index Algorithm");

        for (int i = 0; i < a.size(); i++) {
            //if the last and first index are the same, it means there is only one occurrence
           if(a.indexOf(a.get(i)) == a.lastIndexOf(a.get(i))){
               return a.get(i);
           }
        }
        return -1;
    }
}





