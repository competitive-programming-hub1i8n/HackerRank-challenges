package org.example.others;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
    La clase Calendario es una clase abstracta que proporciona métodos para convertir entre un
    instante específico en el tiempo y un conjunto de campos de calendario como AÑO, MES, DÍA_DE_MES,
    HORA, etc., y para manipular los campos de calendario, como obtener la fecha. de la próxima semana.
    Te dan una fecha. Solo necesita escribir el método getDay(), que devuelve el día en esa fecha.
    Para simplificar su tarea, hemos proporcionado una parte del código en el editor.
    Formato de entrada:
    Una sola línea de entrada que contiene el mes, el día y el año separados por espacios,
    respectivamente, en MM DD YYYY formato.
    Restricciones:
    2000< year < 3000
    Entrada                     Salida
            08 05 2015              WEDNESDAY
 */
public class Example_9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month,day, year;
        month = input.nextInt();
        day = input.nextInt();
        year = input.nextInt();
        String date = day+"/"+month+"/"+year;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date dateFormat = null;
        try {
            dateFormat = format.parse(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        String[] setDay = String.valueOf(dateFormat).split(" ");
        String selectDay = setDay[0];
        System.out.println(day(selectDay));
    }
    public static String day(String selectDay){
        //String selectDay = "";
        if (selectDay.equals("Sat")){
            selectDay = "SATURDAY";
        }else if(selectDay.equals("Sun")){
            selectDay = "SUNDAY";
        }else if(selectDay.equals("Mon")){
            selectDay = "MONDAY";
        }else if(selectDay.equals("Tue")){
            selectDay = "TUESDAY";
        }else if(selectDay.equals("Wed")){
            selectDay = "WEDNESDAY";
        }else if(selectDay.equals("Thu")){
            selectDay = "THURSDAY";
        }else if(selectDay.equals("Fri")){
            selectDay = "FRIDAY";
        }
        return selectDay;
    }
}
