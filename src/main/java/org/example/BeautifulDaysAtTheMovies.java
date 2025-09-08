package org.example;

import java.io.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class BeautifulDaysAtTheMovies {
    /*
     * Complete the 'beautifulDays' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER i
     *  2. INTEGER j
     *  3. INTEGER k
     */

    public static int beautifulDays(int i, int j, int k) {
        // Write your code here
        AtomicInteger count = new AtomicInteger();

        IntStream.range(i, j + 1).parallel().forEach(n -> {
            if (Math.abs(n - reverse(n)) % k == 0) {
                count.getAndIncrement();
            }
        });

        return count.get();
    }

    static int reverse(int n) {
        StringBuilder sb = new StringBuilder();
        sb.append(n);
        String reversed = sb.reverse().toString();
        return Integer.parseInt(reversed);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int i = Integer.parseInt(firstMultipleInput[0]);

        int j = Integer.parseInt(firstMultipleInput[1]);

        int k = Integer.parseInt(firstMultipleInput[2]);

        int result = beautifulDays(i, j, k);
        System.out.println(result);
        bufferedReader.close();
    }
}
