package org.example.others;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class GradingStudents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i <n ; i++) {
            list.add(input.nextInt());
        }
        System.out.println(gradingStudents(list));;
    }
    public static List<Integer> gradingStudents(List<Integer> grades){
        List<Integer> newList = new LinkedList<>();
        Function<Integer, Integer> convert = (item) ->{
            if (item < 38){
                return item;
            }
            int aux = item;
            while (aux%5 != 0){
                aux++;
            }
            return (aux-item < 3)? aux:item;
        };
        for (int i = 0; i < grades.size(); i++) {
            newList.add(convert.apply(grades.get(i)));
        }
        return newList;
    }


}
