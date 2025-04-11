package org.example.DataStructures;

import java.util.*;

public class MissingNumber {
    public static void main(String[] args) {
        /**
         * 10
         * 203 204 205 206 207 208 203 204 205 206
         * 13
         * 203 204 204 205 206 207 205 208 203 206 205 206 204
         */
        Scanner input = new Scanner(System.in);
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        int n = input.nextInt();

        for (int i = 0; i <n ; i++) {
            a.add(input.nextInt());
        }
        n = input.nextInt();
        for (int i = 0; i < n; i++) {
            b.add(input.nextInt());
        }
        System.out.println(missingNummber(a,b));
    }
    public  static List<Integer> missingNummber(List<Integer> a, List<Integer> b){
        Collections.sort(a);
        Collections.sort(b);
        List<Integer> newList = new ArrayList<>();
        List<Integer> listCounter = new ArrayList<>();
        List<Integer> listValue = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            int counter = 0;
            for (int j = 0; j < a.size() ; j++) {
                if (Objects.equals(a.get(i), a.get(j))){
                    counter++;
                }
            }
                listCounter.add(counter);
                listValue.add(a.get(i));
        }
        List<Integer> counterB = new ArrayList<>();
        List<Integer> valueB = new ArrayList<>();
        for (int i = 0; i < b.size(); i++) {
            int counter = 0;
            for (int j = 0; j < b.size() ; j++) {
                if (Objects.equals(b.get(i), b.get(j))){
                    counter++;
                }
            }
                counterB.add(counter);
                valueB.add(b.get(i));
        }

        System.out.println(listCounter + " " + listValue);
        System.out.println(counterB + " " + valueB);
        return newList;
    }
}
/*

 */
