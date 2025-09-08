package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class PickingNumbers {
    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : a) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int max = 0;
        for (int i = 0; i < a.size(); i++) {
            int curr = map.getOrDefault(i, 0) + map.getOrDefault(i + 1, 0);
            max = Math.max(max, curr);
        }

        return max;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .toList();

        int result = pickingNumbers(a);

        System.out.println(result);
        bufferedReader.close();
    }
}
