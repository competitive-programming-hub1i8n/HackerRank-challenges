package org.example.JavaCertification;

import java.util.Arrays;
import java.util.Scanner;

public class MultiSum {
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] numbers = line.split(" ");

        try {
            Integer.parseInt(numbers[0]);
            Integer[] numbersInt = new Integer[numbers.length];

            for (int i = 0; i < numbers.length; i++) {
                numbersInt[i] = new Integer(numbers[i]);
            }
            System.out.println(arithmetic.sum(numbersInt));
        }catch (NumberFormatException e){
            System.out.println(arithmetic.sum(numbers));
        }
    }
}



class Arithmetic {
    public Integer sum(Integer[] numbers){
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }

    public String sum(String[] numbers){
        return String.join("", Arrays.asList(numbers));
    }
}