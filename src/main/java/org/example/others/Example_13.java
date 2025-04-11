package org.example.others;

import java.util.Scanner;

public class Example_13 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(compare(A));


    }
    static String compare(String A){
        String[] array = A.split("");
        String revert = "";
        for (int i = array.length-1; i > -1 ; i--) {
            revert += array[i];
        }
        if(A.equals(revert))
            return "Yes";
        else
            return "No";
    }
}
