package org.example.Algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Resultee {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
        // Write your code here

    }

}
public class Example_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Resultee.staircase(n);

        bufferedReader.close();
        /*int j=21;
        for (int i = 0; i <= j; i++) {
            if (j == 0)
                break;
            System.out.printf("%"+(j)+"s", "");
            for (int k = i; k >= 0; k--) {
                System.out.print("#");
            }
            System.out.println();
            j--;
        }*/
        System.out.printf("%10s", "#");

    }
}
