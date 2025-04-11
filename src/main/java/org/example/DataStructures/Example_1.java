package org.example.DataStructures;

import java.util.ArrayList;
import java.util.Scanner;

public class Example_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<Integer>[] row = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            row[i] = new ArrayList<>();
            int n2 = input.nextInt();
            for (int j = 0; j < n2; j++) {
                row[i].add(input.nextInt());
            }
        }

        int n3 = input.nextInt();
        System.out.println(row[row.length-1].size());
        for (int i = 0; i < n3 ; i++) {
            int start = input.nextInt();
            int end = input.nextInt();
            try {
                if (!row[start-1].isEmpty()){
                    System.out.println(row[start-1].get(end-1));
                }else {
                    System.out.println("ERROR!");
                }
            }catch (Exception e){
                System.out.println("ERROR!");
            }
        }
    }
}
