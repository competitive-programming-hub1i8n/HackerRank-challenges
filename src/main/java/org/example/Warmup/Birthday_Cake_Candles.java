package org.example.Warmup;

import java.util.*;

public class Birthday_Cake_Candles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<Integer> candles = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            candles.add(input.nextInt());
        }
        System.out.println(fun(candles));
        //System.out.println(Arrays.toString(candles.toArray()));
    }
    static int fun(List<Integer> candles){
        Integer max = Collections.max(candles);
        int counter = 0;
        for (Integer i: candles) {
            if (Objects.equals(i, max)){
                counter++;
            }
        }
        return counter;
    }
}
