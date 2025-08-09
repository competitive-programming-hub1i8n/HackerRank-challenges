package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class SalesByMatch {
    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        Set<Integer> set = new HashSet<>();
        int countPairs = 0;
        for (int i = 0; i < ar.size(); i++) {
            int cur =  ar.get(i);
            if (!set.contains(cur)){
                set.add(cur);
                int count = 0;
                for (Integer integer : ar)
                    if (integer == cur) count++;
                countPairs += count / 2;
            }
        }
        return countPairs;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .toList();

        int result = sockMerchant(n, ar);
        System.out.println(result);
        bufferedReader.close();
    }
}
