package com.raffenio.leetcode.com.problems.valid.anagram;

public class AnagramBenchmarkClaude {

    public static boolean isAnagram(String s, String t) {
        // Pequeña optimización recomendada:
        // Si las longitudes son diferentes, no pueden ser anagramas.
        if (s.length() != t.length()) return false;

        int[] abc = new int[26];

        for(char c : s.toCharArray()){
            abc[c-'a']++;
        }

        for(char c : t.toCharArray()){
            abc[c-'a']--;
        }

        for(int i=0; i < abc.length ; i++){
            if( abc[i]!=0 ){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Casos de prueba
        String[][] testCases = {
                {"anagram", "nagaram"},
                {"rat", "car"},
                {"listen", "silent"},
                {"hello", "world"},
                {"triangle", "integral"},
                {"abcdefghijklmnopqrstuvwxyz", "zyxwvutsrqponmlkjihgfedcba"}
        };

        System.out.println("=== BENCHMARK DE ALGORITMO VALID ANAGRAM ===\n");

        // Calentamiento de la JVM
        System.out.println("Calentando JVM...");
        for(int i = 0; i < 10000; i++) {
            isAnagram("warmup", "mrawpu");
        }
        System.out.println("Calentamiento completado.\n");

        // Ejecutar benchmark para cada caso
        for(String[] testCase : testCases) {
            String s = testCase[0];
            String t = testCase[1];

            System.out.println("Caso: \"" + s + "\" vs \"" + t + "\"");

            int iterations = 1000000; // 1 millón de iteraciones
            long startTime = System.nanoTime();

            boolean result = false;
            for(int i = 0; i < iterations; i++) {
                result = isAnagram(s, t);
            }

            long endTime = System.nanoTime();
            long totalTime = endTime - startTime;

            double avgTimeNanos = (double) totalTime / iterations;
            double avgTimeMicros = avgTimeNanos / 1000.0;
            double avgTimeMillis = avgTimeNanos / 1000000.0;

            System.out.println("  Resultado: " + result);
            System.out.println("  Iteraciones: " + String.format("%,d", iterations));
            System.out.println("  Tiempo total: " + String.format("%.2f", totalTime / 1000000.0) + " ms");
            System.out.println("  Tiempo promedio por ejecución:");
            System.out.println("    - " + String.format("%.2f", avgTimeNanos) + " nanosegundos");
            System.out.println("    - " + String.format("%.4f", avgTimeMicros) + " microsegundos");
            System.out.println("    - " + String.format("%.6f", avgTimeMillis) + " milisegundos");
            System.out.println();
        }

        // Benchmark intensivo con strings más largas
        System.out.println("\n=== BENCHMARK CON STRINGS LARGOS ===\n");

        StringBuilder longStr1 = new StringBuilder();
        StringBuilder longStr2 = new StringBuilder();
        for(int i = 0; i < 1000; i++) {
            longStr1.append("abcdefghijklmnopqrstuvwxyz");
            longStr2.append("zyxwvutsrqponmlkjihgfedcba");
        }

        String large1 = longStr1.toString();
        String large2 = longStr2.toString();

        System.out.println("Longitud de strings: " + large1.length() + " caracteres");

        int largeIterations = 10000;
        long startTime = System.nanoTime();

        boolean result = false;
        for(int i = 0; i < largeIterations; i++) {
            result = isAnagram(large1, large2);
        }

        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;

        double avgTimeNanos = (double) totalTime / largeIterations;
        double avgTimeMicros = avgTimeNanos / 1000.0;
        double avgTimeMillis = avgTimeNanos / 1000000.0;

        System.out.println("Resultado: " + result);
        System.out.println("Iteraciones: " + String.format("%,d", largeIterations));
        System.out.println("Tiempo total: " + String.format("%.2f", totalTime / 1000000.0) + " ms");
        System.out.println("Tiempo promedio por ejecución:");
        System.out.println("  - " + String.format("%.2f", avgTimeNanos) + " nanosegundos");
        System.out.println("  - " + String.format("%.4f", avgTimeMicros) + " microsegundos");
        System.out.println("  - " + String.format("%.6f", avgTimeMillis) + " milisegundos");
    }
}