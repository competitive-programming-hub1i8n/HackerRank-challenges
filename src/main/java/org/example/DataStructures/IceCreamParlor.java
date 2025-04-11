package org.example.DataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IceCreamParlor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<Integer> prices = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int amount = input.nextInt();
            int amountNumbers = input.nextInt();
            for (int j = 0; j < amountNumbers ; j++) {
                prices.add(input.nextInt());
            }
            System.out.println(iceCreamParlor(amount, prices));
        }
    }
    public static List<Integer> iceCreamParlor(int amount, List<Integer> prices){
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < prices.size() ; i++) {
            for (int j = i+1; j < prices.size(); j++) {
                if (prices.get(i)+prices.get(j) == amount){
                    result.add(i+1);
                    result.add(j+1);
                    break;
                }
            }
            if (!result.isEmpty()){
                break;
            }
        }
        return result;
    }
}
