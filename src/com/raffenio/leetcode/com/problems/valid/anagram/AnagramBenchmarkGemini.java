package com.raffenio.leetcode.com.problems.valid.anagram;
import java.util.Random;

public class AnagramBenchmarkGemini {
        public static void main(String[] args) {
            AnagramBenchmarkGemini benchmark = new AnagramBenchmarkGemini();

            // 1. Preparación de datos (Cadenas largas para que el CPU trabaje)
            String s = generateRandomString(10000); // Cadena de 10,000 caracteres
            String t = shuffleString(s);            // La misma cadena desordenada (es un anagrama válido)

            System.out.println("--- Iniciando Benchmark ---");
            System.out.println("Longitud de las cadenas: " + s.length());

            // 2. FASE DE CALENTAMIENTO (Warm-up)
            // Ejecutamos el código muchas veces sin medir tiempo para que la JVM optimice
            System.out.println("Calentando la JVM...");
            for (int i = 0; i < 20000; i++) {
                benchmark.isAnagram(s, t);
            }

            // 3. FASE DE MEDICIÓN
            int iterations = 100000; // Cien mil ejecuciones
            long startTime = System.nanoTime();

            for (int i = 0; i < iterations; i++) {
                benchmark.isAnagram(s, t);
            }

            long endTime = System.nanoTime();
            long totalTime = endTime - startTime;

            // 4. RESULTADOS
            double averageTimeNs = (double) totalTime / iterations;
            double averageTimeMs = averageTimeNs / 1_000_000.0;

            System.out.println("--- Resultados ---");
            System.out.println("Iteraciones totales: " + iterations);
            System.out.println("Tiempo total: " + (totalTime / 1_000_000.0) + " ms");
            System.out.printf("Tiempo promedio por ejecución: %.4f nanosegundos%n", averageTimeNs);
            System.out.printf("Tiempo promedio por ejecución: %.6f milisegundos%n", averageTimeMs);
        }

        // --- TU ALGORITMO ---
        public boolean isAnagram(String s, String t) {
            // Pequeña optimización recomendada:
            // Si las longitudes son diferentes, no pueden ser anagramas.
            if (s.length() != t.length()) return false;

            int[] abc = new int[26];

            for (char c : s.toCharArray()) {
                abc[c - 'a']++;
            }

            for (char c : t.toCharArray()) {
                abc[c - 'a']--;
            }

            for (int i = 0; i < abc.length; i++) {
                if (abc[i] != 0) {
                    return false;
                }
            }
            return true;
        }

        // --- MÉTODOS AUXILIARES PARA GENERAR PRUEBAS ---

        // Genera una cadena aleatoria de longitud n
        private static String generateRandomString(int length) {
            StringBuilder sb = new StringBuilder(length);
            Random random = new Random();
            for (int i = 0; i < length; i++) {
                char c = (char) ('a' + random.nextInt(26));
                sb.append(c);
            }
            return sb.toString();
        }

        // Mezcla una cadena para crear un anagrama válido
        private static String shuffleString(String input) {
            char[] characters = input.toCharArray();
            Random random = new Random();
            for (int i = 0; i < characters.length; i++) {
                int randomIndex = random.nextInt(characters.length);
                char temp = characters[i];
                characters[i] = characters[randomIndex];
                characters[randomIndex] = temp;
            }
            return new String(characters);
        }
    }
