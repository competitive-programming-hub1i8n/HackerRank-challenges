package org.example.others;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionHandlingTrycatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            Integer x = scanner.nextInt();
            Integer y = scanner.nextInt();
            if (!(x instanceof Integer) || !(y instanceof Integer)){
                throw new InputMismatchException();
            } else if (y < 0 || x < 0){
                throw new InputMismatchException();
            }
            System.out.println(x / y);
        }catch (InputMismatchException e){
            System.out.println(e.getClass().getName());
        }catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
