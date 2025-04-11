package org.example.others;

import java.util.Scanner;

public class Example_16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String[] newS = s.split("[^a-zA-Z]+");
        int counter = 0;
        for (int i = 0; i < newS.length; i++) {
            if (newS[i].length() > 0 ){
                counter++;
            }
        }
        System.out.println(counter);
        for (int i = 0; i < newS.length; i++) {
            if (newS[i].length() > 0 ){
                counter++;
            }
            System.out.println(i+1 + " " + newS[i]);
        }
        scan.close();
    }
    /*
               YES      leading spaces        are valid,    problemsetters are         evillllll
     */
}
