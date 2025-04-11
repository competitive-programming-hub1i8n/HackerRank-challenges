package org.example.BigInteger;

import java.math.BigInteger;
import java.util.Scanner;
/*
    ¡En este problema, tienes que sumar y multiplicar números enormes! Estos números son tan grandes que no
    puede contenerlos en ningún tipo de datos ordinario como un int long.
    Utilice el poder de la clase BigInteger de Java y resuelva este problema.
    Formato de entrada
        Habrá dos líneas que contienen dos números, a y b.
    Restricciones
        a y b son enteros no negativos y pueden tener un máximo de 200 dígitos;
    Formato de salida
        Salida de dos líneas. La primera línea debe contener, a + b y la segunda línea debe contener a * b.
        No imprima ningún cero a la izquierda.

    Entrada
        999999992344444444444499999990000000000000000000000
        213200000000000001231230000000000000000000000000000000000000000000000000000000000000000000000
    Salida:
        213200000000000001231230000000000000000000999999992344444444444499999990000000000000000000000
        213199998367835556786797390572118333333401734987687700000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000

 */
public class Example_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String A = input.next();
        String B = input.next();
        BigInteger numberA = new BigInteger(A);
        BigInteger numberB = new BigInteger(B);

        BigInteger resultAddition = numberA.add(numberB);
        BigInteger resultMultiply = numberA.multiply(numberB);
        System.out.println(resultAddition);
        System.out.println(resultMultiply);
    }
}
