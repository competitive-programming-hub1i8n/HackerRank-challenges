package org.example;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class DrawingBook {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int result = pageCount(n, p);

        System.out.println(result);
        bufferedReader.close();
    }

    public static int pageCount(int n, int p) {
        // Write your code here
        int front = (p / 2);
        int end = (n/2) - front;
        return Math.min(front, end);
    }
}
