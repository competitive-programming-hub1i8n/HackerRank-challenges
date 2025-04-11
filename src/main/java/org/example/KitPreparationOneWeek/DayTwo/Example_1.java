package org.example.KitPreparationOneWeek.DayTwo;

import java.util.Arrays;
import java.util.List;

public class Example_1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,3,2,1, 10);
        for (int i = 0; i < list.size(); i++) {
            int counter = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) == list.get(j))
                    counter++;
            }
            if (counter == 1){
                System.out.println(list.get(i));
            }
        }
    }
}
