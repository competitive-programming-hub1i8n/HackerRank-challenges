package org.example.Algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class Example_2 {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            int n = input.nextInt();
            if (i < 3){
                A.add(n);
            }else if (i > 3){
                B.add(n);
            }
        }
        ArrayList<Integer> result = Result2.compareTriplets(A,B);
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }


    }
}
class Result2 {

    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static ArrayList<Integer> compareTriplets(ArrayList<Integer> a, ArrayList<Integer> b) {
        int counterA = 0;
        int counterB = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                counterA++;
            }else if(a.get(i) < b.get(i)){
                counterB++;
            }
        }
        a.clear();
        a.add(counterA);
        a.add(counterB);
        return a;
    }

}
