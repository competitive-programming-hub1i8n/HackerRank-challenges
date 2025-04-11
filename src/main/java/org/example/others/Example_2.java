
package org.example.others;
import java.util.Scanner;
/*
    La función System.out.printf de Java se puede utilizar para imprimir la salida formateada.
    El propósito de este ejercicio es probar su comprensión del formato de salida usando printf.
    Para empezar, se le proporciona una parte de la solución en el editor;
    debe formatear e imprimir la entrada para completar la solución.
    Formato de entrada
    Cada línea de entrada contendrá una cadena seguida de un número entero.
    Cada String tendrá un máximo decaracteres alfabéticos, y cada número
    entero estará en el rango inclusivo dea.

    Formato de salida
    En cada línea de salida debe haber dos columnas:
        La primera columna contiene la Cadena y se justifica a la izquierda usando exactamentecaracteres.
        La segunda columna contiene el número entero , expresado en exactamentedígitos; si la entrada
        original tiene menos de tres dígitos, debe rellenar los primeros dígitos de su salida con ceros.

    Entrada de muestra
        java 100
        cpp 65
        python 50
    Salida de muestra
        ================================
        java           100
        cpp            065
        python         050
        ================================
 */
public class Example_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] array = new String[3];
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            String aux = "";
            //Complete this line
            if(x < 100){
                String convert = String.valueOf(x);
                String cero = "0"+convert;
                aux = cero;
            }
            if (x >= 100){
                array[i] = s1+"\t\t" + x;
            }else{
                array[i] = s1+" \t\t" + aux;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("================================");
    }
}
