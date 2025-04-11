package org.example.Algorithms;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Example_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        int j = 0;
        int k = arr.size()-1;
        int sumA = 0;
        int sumaB = 0;
        for (int i = 0; i < arr.size(); i++) {
            sumA += arr.get(i).get(j);
            sumaB += arr.get(i).get(k);
            j++;
            k--;
        }
        System.out.println(Math.abs(sumA-sumaB));

    }
}
