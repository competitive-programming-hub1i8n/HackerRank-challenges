package org.example.others;

import java.util.Arrays;
import java.util.Scanner;

public class Example_15 {
    /*
        dos cadena a y b se llaman anagramas si contienen todos los mismos caracteres en las mismas frecuencias.
        Para este desafío, la prueba no distingue entre mayúsculas y minúsculas. Por ejemplo, los anagramas de CAT
        son CAT, ACT, tac, TCA, aTCy CtA.

        Función descriptiva
            Complete la función isAnagram en el editor.
            isAnagram tiene los siguientes parámetros:
                ->cadena a: la primera cadena
                ->cadena b: la segunda cadena
        Devoluciones
            booleano: si a y b son anagramas que no distinguen entre mayúsculas y minúsculas, devuelven verdadero.
                      De lo contrario, devuelve falso.
        Formato de entrada
            La primera línea contiene una cadena a.
            La segunda línea contiene una cadena b.
        Entrada                 Salida
            anagram
            margana             Anagrams


        Coidgo en el editor:
            import java.util.Scanner;
            public class Solution {
                static boolean isAnagram(String a, String b) {
                }
                public static void main(String[] args) {

                    Scanner scan = new Scanner(System.in);
                    String a = scan.next();
                    String b = scan.next();
                    scan.close();
                    boolean ret = isAnagram(a, b);
                    System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
                }
            }
    */
    static boolean isAnagram(String a, String b) {
        String[] stringA = a.toLowerCase().split("");
        String[] stringB = b.toLowerCase().split("");
        Arrays.sort(stringA);
        Arrays.sort(stringB);
        String newA = "";
        String newB = "";
        for (int i = 0; i < stringA.length; i++) {
            newA += stringA[i];
        }
        for (int i = 0; i < stringB.length; i++) {
            newB += stringB[i];
        }
        // Complete the function
        if (newA.equals(newB))
            return true;
        return false;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
