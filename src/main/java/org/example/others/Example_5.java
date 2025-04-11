package org.example.others;

import java.util.Scanner;

public class Example_5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.println(N + " x " + i + " = " + N*i);
        }
    }
}
