package org.example.others;

import java.util.Scanner;
/*
    En este desafío, ponemos a prueba su conocimiento sobre el uso de sentencias condicionales if-else
    para automatizar los procesos de toma de decisiones. Una sentencia if-else tiene el siguiente flujo
    lógico:

    Tarea
        Dado un número entero n realice las siguientes acciones condicionales:

        Si n es impar, imprimir Weird
        Si n es par y en el rango inclusivo de 2 a 5, imprimir Not Weird
        Si n es par y en el rango inclusivo de 6 a 20, imprimir Weird
        Si n es par y mayor que 20, imprimir Not Weird
     Complete el código de resguardo proporcionado en su editor para imprimir si o noes raro.

    Formato de entrada
    Una sola línea que contiene un número entero positivo n.
    Restricciones
        1<= n <= 100
    Formato de salida

    Imprima Weird si el número es extraño; de lo contrario, imprima Not Weird.

    Entrada         Salida

    3               Weird
    24              Not Weird
 */
public class Example_3 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(N % 2 != 0){
            System.out.println("Weird");
        }else if(N % 2 == 0 && N >= 2 && N <= 5){
            System.out.println("Not Weird");
        }else if(N % 2 == 0 && N >= 6 && N <= 20){
            System.out.println("Weird");
        }else if(N % 2== 0 && N > 20){
            System.out.println("Not Weird");
        }
        scanner.close();
    }
}
