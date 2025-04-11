package org.example.KitPreparationOneWeek.DayTwo;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class CoutingSort_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        int counter = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 2){
                counter++;
            }
        }
        System.out.println(counter);
        //|System.out.println(Arrays.toString(countingSort(arr).keySet().toArray(new Integer[0])));
        System.out.println(Arrays.toString(countingSort(arr).toArray()));
        bufferedReader.close();
    }
    public static List<Integer> countingSort(List<Integer> arr){
        Collections.sort(arr);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 100; i++) {
            map.put(i,0);
        }
        for (Integer key : map.keySet()) {
            for (int i = 0; i < arr.size() ; i++) {
                if (key == arr.get(i)){
                    map.replace(key, map.get(key)+1);
                }
            }
        }
        Collection<Integer> values = map.values();
        List<Integer> integerList = new ArrayList<>(values);
        return  integerList;
    }
}
