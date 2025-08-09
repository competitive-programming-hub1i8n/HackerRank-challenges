package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BreakingTheRecords {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .toList();

        List<Integer> result = breakingRecords(scores);

        result.forEach(System.out::println);

        bufferedReader.close();

    }

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        int maxScore = scores.getFirst();
        int minScore = scores.getFirst();
        int maxCount = 0;
        int minCount = 0;
        for (int i = 1; i < scores.size(); i++) {
            int currentScore = scores.get(i);
            if (currentScore > maxScore) {
                maxScore = currentScore;
                maxCount++;
            } else if (currentScore < minScore) {
                minScore = currentScore;
                minCount++;
            }
        }
        result.add(maxCount);
        result.add(minCount);
        return result;
    }
}
