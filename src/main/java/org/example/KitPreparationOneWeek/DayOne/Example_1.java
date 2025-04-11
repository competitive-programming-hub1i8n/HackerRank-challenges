package org.example.KitPreparationOneWeek.DayOne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @<b><i>Explicacion</i>:</b> <i>Dado un array de longitud 5 hallar la suma de 4 de sus elementos, la suma minima y la suma mayor</i>
 * @<b><i>Explicacion:</i></b> <i>Input<br>1 2 3 4 5<br><i>output</i><br>10 14</i>
 * @<i>Example</i> <ol><li>Suma todo excepto 1, ls auma es 2+3+4+5= 14</li> <li>Suma todo excepto 2, la suma es 1+3+4+5 = 13</li> <li>Suma todo excepto 3, la suma es 1+2+4+5 = 12</li> <li>Suma todo excepto 4, la suma es  1+2+3+5 = 11</li> <li>suma todo excepto 5, la suma es 1+2+3+4= 10</li></ol>
 */
public class Example_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        List<Long> additionList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }

        long saveMinimun = 0;
        long saveMAximun = 0;

        for (int i = 0; i < list.size(); i++) {
            long suma = 0;
            for (int j = 0; j < list.size(); j++) {
                if (j!=i){
                    suma+=list.get(j);
                }
            }
            additionList.add(suma);
        }
        Collections.sort(additionList);

        System.out.println(additionList.get(0) +" " + additionList.get(additionList.size()-1));
    }
}
