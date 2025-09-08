package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ViralAdvertising {
    /*
     * Complete the 'viralAdvertising' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int viralAdvertising(int n) {
        // Write your code here
        int cumulativeLikes = 0;
        int shared = 5;
        for (int i = 1; i <= n; i++) {
            int liked = shared /2;
            shared = liked * 3;
            cumulativeLikes += liked;
        }
        return cumulativeLikes;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int result = viralAdvertising(n);

        System.out.println(result);
        bufferedReader.close();
    }
}
