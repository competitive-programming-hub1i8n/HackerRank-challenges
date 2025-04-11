package org.example.others;

import java.util.Scanner;

public class JavaRegexDuplicateWords {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String regex = "\\b(\\w+)(\\s+\\1\\b)+";
        int n = Integer.parseInt(in.nextLine());
        for (int i = 0; i < n; i++) {
            String input = in.nextLine();
            String output = input.replaceAll(regex, " ");
            System.out.println(output);
        }
    }
}
