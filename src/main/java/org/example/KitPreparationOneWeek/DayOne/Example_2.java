package org.example.KitPreparationOneWeek.DayOne;


import java.text.ParseException;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


import java.util.Locale;
import java.util.Scanner;

/**
 * @<b><i>Explicacion</i></b> <i>Dado una hora como estring en un formato de 12 horas convertirlo a uun formato de 24 horas</i>
 * @<b><i>Ejemplo</i></b> <ol> <li>s = '12:01:00PM' <ul><li>retorna '12:01:00'</li></ul> <li>s = '12:01:00AM' <ul><li>retorna: '00:01:00'</li></ul> </li></ol>
 */
public class Example_2 {
    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);
        String inputDate = input.nextLine();
        String FormatDate = inputDate.substring(0,8)+ " " + inputDate.substring(8,inputDate.length());

        String result = LocalTime.parse(FormatDate, DateTimeFormatter
                        .ofPattern("hh:mm:ss a", Locale.US))
                .format( DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(result);
    }
}
