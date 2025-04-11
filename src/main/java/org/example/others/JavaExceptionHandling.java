package org.example.others;

import java.util.Scanner;

public class JavaExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            try {
                int n = scanner.nextInt();
                int p = scanner.nextInt();

                if (n == 0 && p == 0){
                    throw new Exception("n and p should not be zero.");
                } else if (n < 0 || p < 0) {
                    throw new Exception("n or p should not be negative.");
                }
                System.out.println((int)Math.pow(n, p));
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
/**
 * 3 5
 * 2 4
 * 0 0
 * -1 -2
 * -1 3
 */