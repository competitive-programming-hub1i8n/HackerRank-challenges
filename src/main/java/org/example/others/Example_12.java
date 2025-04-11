package org.example.others;

import java.util.Scanner;
/*
    Dada una cadena S y dos índices inicio y fin imprime una subcadena
    Formato de entrada
        La primera línea contiene una sola cadena que denota s.
        La segunda línea contiene dos números enteros separados por espacios que indican los valores
        respectivos de inicio y fin.
    Formato de salida
        Imprime la subcadena en el rango inclusivo de inicio a fin.
    Ejemplo
        Entrada                             Salida
        Helloworld
        3 7                                     lowo

        sdfjsdfjLSJFLDSKHFJFHDLFKHDFDLJF
        0 10                                    sdfjsdfjLS

 */
public class Example_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        if (start >= 0 && end > start && end <= S.length())
            System.out.println(S.substring(start, end));
    }
}
