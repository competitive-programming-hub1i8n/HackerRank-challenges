package org.example.others;

import java.util.Scanner;
/*
        Java tiene 8 tipos de datos primitivos; char, boolean, byte, short, int, long, float y double.
        Para este ejercicio, trabajaremos con las primitivas utilizadas para contener valores
        enteros (byte, short, int y long ):
            ->Un byte es un entero de 8 bits con signo.
            ->Un short es un entero de 16 bits con signo.
            ->Un int es un entero con signo de 32 bits.
            ->Un largo es un entero de 64 bits con signo.
        Dado un entero de entrada, debe determinar qué tipos de datos primitivos son capaces de
        almacenar correctamente esa entrada.

        Formato de entrada
            La primera línea contiene un número entero T que denota el número de casos de prueba.
            Cada caso de prueba T se compone de una sola línea con un número entero n que puede ser arbitrariamente grande o pequeño.

        Formato de salida
            Para cada variable de entrada n primitivo, debe determinar si el numero n primitivo dado son
            capaces de almacenarlo. En caso afirmativo, imprima:

            n can be fitted in:
            * dataType
        Si hay más de un tipo de datos apropiado, imprima cada uno en su propia línea y
        ordénelos por tamaño (es decir:). byte < short < int < long

        Si el número no se puede almacenar en una de las cuatro primitivas antes mencionadas,
        imprima la línea:
            n can't be fitted anywhere.
        Entrada de muestra
            5
            -150
            150000
            1500000000
            213333333333333333333333333333333333
            -100000000000000
        Salida de muestra

            -150 can be fitted in:
            * short
            * int
            * long
            150000 can be fitted in:
            * int
            * long
            1500000000 can be fitted in:
            * int
            * long
            213333333333333333333333333333333333 can't be fitted anywhere.
            -100000000000000 can be fitted in:
            * long
     */
public class Example_7 {
    public static void main(String []argh) {
        Scanner sc = new Scanner(System.in);
        long t=sc.nextLong();
        for(long i=0;i<t;i++) {
            try {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)
                    System.out.println("* byte");
                //Complete the code
                if(x >= -32768 && x <= 32767)
                    System.out.println("* short");
                if(x >= -2147483648  && x <= 2147483647)
                    System.out.println("* int");
                if(x >= -9223372036854775808L && x <= 9223372036854775807L){
                    System.out.println("* long");
                }
            }
            catch(Exception e) {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
    }
}
