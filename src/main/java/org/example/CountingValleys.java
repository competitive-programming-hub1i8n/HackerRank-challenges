package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountingValleys {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = countingValleys(steps, path);
        System.out.println(result);

        bufferedReader.close();
    }

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int level = 0;
        int valley = 0;
        for (int i = 0; i < path.length(); i++) {
            char c = path.charAt(i);
            if (level == 0 && c == 'D'){
                level--;
                valley++;
            }else if (level == 0 && c == 'U'){
                level++;
            } else if (c == 'D') {
                level--;
            }else {
                level++;
            }
        }
        return valley;
    }
}
