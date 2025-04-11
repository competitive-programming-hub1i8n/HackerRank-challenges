

package org.example.others;

import java.util.Scanner;
/*
    Este ejercicio es para probar su comprensión de Java Strings. Una declaración de cadena de muestra :
        String myString = "Hello World!"
    Los elementos de un String se llaman caracteres. El número de caracteres en una cadena se denomina
    longitud y se puede recuperar con el método String.length().
    Dadas dos cadenas de letras minúsculas en inglés A,B realice las siguientes operaciones:
        1-> Sumar la longitudes A y B
        2-> comprobar si estan en orden lexicografico es decir si B viene antes que A
        3-> Converti la primera letra de cada poalabra en mayuscula
    Formato de entrada
        La primera línea contiene una cadena A. La segunda línea contiene otra cadena B.
        Las cadenas se componen únicamente de letras minúsculas en inglés.
    Formato de salida
        Hay tres líneas de salida:
            Para la primera línea, sume las longitudes de A y B.
            Para la segunda línea, escribe Yes si B es lexicográficamente mayor que A de lo contrario,
            imprima No en su lugar.
            Para la tercera línea, escriba en mayúscula la primera letra en ambos A y B e imprímelas en
            una sola línea, separadas por un espacio.
     Entrada                    Salida
        hola                       9
        java                       No
                                   Hola Java

        java                       9
        hola                       si
                                   Java Hola

 */
public class Example_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int suma = A.length()+B.length();
        System.out.println(suma);
        System.out.println(compareString(A, B));
        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1) + " " +
                B.substring(0,1).toUpperCase()+B.substring(1));


    }
    static String compareString(String A, String B){
        String reponse = "";
        //compara si B viene antes que A es decir si estan en orden lexicografico
         // si estan en orden devuelve una variable entera negativo.
        // Pero si no estan en orden devuelve una variable entera positiva
        //si ambos son iguales debuelbe 0;
        int caso = B.compareTo(A);
        if(caso > 0)
            reponse = "No";
        else if(caso < 0)
            reponse = "Si";
        return reponse;
    }
}
