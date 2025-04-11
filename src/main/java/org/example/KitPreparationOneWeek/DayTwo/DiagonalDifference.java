package org.example.KitPreparationOneWeek.DayTwo;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class DiagonalDifference {

    public static void main(String[] args)throws IOException {
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
        System.out.println(RD(arr));
    }

    static Integer RD(List<List<Integer>> arr){
        int row = 0;
        int column = 0;
        int reverseRow = 0;
        int reverseColumn = arr.size()-1;
        int sumaDiagonal = 0;
        int sumaDiagonalReverse = 0;
        while (row < arr.size() && column < arr.size() && reverseRow < arr.size() && reverseColumn >= 0){
            sumaDiagonal += arr.get(row).get(column);
            sumaDiagonalReverse += arr.get(reverseRow).get(reverseColumn);
            row++;
            column++;
            reverseRow++;
            reverseColumn--;
        }
        return Math.abs(sumaDiagonal-sumaDiagonalReverse);
    }
}
