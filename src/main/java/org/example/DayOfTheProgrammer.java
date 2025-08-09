package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.Calendar;

public class DayOfTheProgrammer {
    /*
     * Complete the 'dayOfProgrammer' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER year as parameter.
     */

    public static String dayOfProgrammer(int year) {
        // Write your code here
        String answer = "";
        if (year >= 1700 && year <= 1917) {
            if (year % 4 == 0) answer = String.format("%02d.%02d.%04d", 12, 9, year);
            else answer = String.format("%02d.%02d.%04d", 13, 9, year);
        }
        else if (year >= 1919 && year <= 2700) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) answer = String.format("%02d.%02d.%04d", 12, 9, year);
            else answer = String.format("%02d.%02d.%04d", 13, 9, year);
        }
        else answer = String.format("%02d.%02d.%04d", 26, 9, year);

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = dayOfProgrammer(year);

        System.out.println(result);
        bufferedReader.close();
    }
}
