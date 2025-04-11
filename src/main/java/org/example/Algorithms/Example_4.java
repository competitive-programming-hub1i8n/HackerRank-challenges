package org.example.Algorithms;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/**
 * @<b>Description:</b><i> Dada una matriz de enteros, calcule las proporciones de sus elementos que son positivos, negativos y cero. Imprime el valor decimal de cada fracción en una nueva línea con 6 lugares después del decimal.</i>
 *@<b><mark>Nota</mark>:</b><i> Este desafío presenta problemas de precisión. Los casos de prueba están escalados a seis decimales, aunque las respuestas con un error absoluto de hasta 10^-4 son aceptables.</i>
 * @<b>Example:</b> arr=[1, 1, 0, -1, -1]<br>Existen n= 5 elementos de las cuales 2 son positivos, 1 es 0 y 2 son negativos.<br>Sus proporciones son:<pre>    2/5=0.400000<br>    2/5=0.400000<br>    1/5=0.200000</pre>
 * @<b>Funcion_Descriptiva:</b> Complete la función plusMinus en el editor a continuación.<br>plusMinus tiene los siguientes parámetros:<ul><li>int arr[n] : una matriz de enteros</li></ul>
 * @<b>Imprimir:</b> <i>Imprime las proporciones de valores positivos, negativos y cero en la matriz. Cada valor debe imprimirse en una línea separada con 6 dígitos después del decimal. La función no debe devolver un valor.</i>
 * @<b>Formato_de_Entrada:</b> <ul><li>LA primera linea contiene un n entero positivo que es el tamaño del array</li> <li>La seguda linea n enteros separados por <b>arr[n]</b></li></ul>
 * @<b>Restricciones:</b> </b> <ul><li><b>0< n <=100</b></li> <li><b>-100 <= arr[i] <= 100</b></li></ul>
 * @<b>Formato_de_Salida:</b></b> <ol><li><b>Proporcion de valores positivos</b></li> <li><b>Proporcion de valores negativos </b></li> <li><b>Proporcion de ceros </b></li></ol>
 * @<b>Entrada_de_Muetra:</b> <table><tbody> <tr><th>STDIN</th> <th>Funtion</th> <br> </tr> <tr><td>6</td> <td>arr[] size n = 6</td></tr> <tr><td>-4 3 -9 0 4 1 </td> <td>arr = [-4, 3, -9, 0, 4, 1]</td></></tr> </tbody></table>
 * @<b>Salida_de_Muetra:</b> <ol><li><b>0.500000</b></li> <li><b>0.333333</b></li> <li><b>0.166667</b></li></ol>
 */
class Result {
    //(2*(5+(2/2)*(5+2)-(1+(2+5))))

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int counterPositives = 0;
        int counterNegatives = 0;
        int counterZeros = 0;
        for (int i = 0; i <arr.size() ; i++) {
            if (arr.get(i) > 0)
                counterPositives++;
            else if (arr.get(i) < 0)
                counterNegatives++;
            else
                counterZeros++;
        }
        System.out.format("%.6f", (float)counterPositives/arr.size());
        System.out.println();
        System.out.format("%.6f", (float)counterNegatives/arr.size());
        System.out.println();
        System.out.format("%.6f", (float)counterZeros/arr.size());

    }

}

public class Example_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
