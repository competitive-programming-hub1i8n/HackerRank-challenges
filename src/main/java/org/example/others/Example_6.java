package org.example.others;

import java.util.Scanner;

/*Usamos los números enteros a, b y n para crear la siguiente serie:
            (a + 2 ** 0 * b), (a + 2 ** 0 * b + 2 ** 1 * b), (a + 2 ** 0 * b + 2 ** 1 * b + 2 ** 2 * b + .... 2 ** n * b)
    te dan t consultas en forma de a, b y n. Para cada consulta, imprima la serie correspondiente a
    la dada a, b y n valores como una sola línea de n enteros separados por espacios.

            -> Formato de entrada
    La primera línea contiene un número entero t que indica el número de consultas.
    Cada línea i del t las líneas subsiguientes contienen tres enteros separados por espacios
    que describen los respectivos a, b y n valores para esa consulta.

        -> Formato de salida
    Para cada consulta, imprima la serie correspondiente en una nueva línea.
    Cada serie debe imprimirse en orden como una sola línea deenteros separados por espacios.

    Input           Output
    prueba_1
                2
                   0 2 10      2 6 14 30 62 126 254 510 1022 2046
                    5 3 5       8 14 26 50 98
    prueba_2
                3
                   3 3 3           6 12 24
                   0 0 5           0 0 0 0 0
                   6 6 10          12 24 48 96 192 384 768 1536 3072 6144

*/
public class Example_6 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int inicial = (a +1*b);
            System.out.print(inicial + " ");
            for(int j = 1; j<n; j++  ){
                int aux = 2;
                for (int k = 1; k < j; k++) {
                    aux *= 2;
                }
                inicial += aux*b;
                System.out.print(inicial + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
