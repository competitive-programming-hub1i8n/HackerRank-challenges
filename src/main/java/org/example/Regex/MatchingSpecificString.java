package org.example.Regex;

import java.awt.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingSpecificString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = "hackerrank";
        String testString = scanner.nextLine();

        Pattern pattern = Pattern.compile(s);
        Matcher matcher = pattern.matcher(testString);
        int counter = 0;
        while (matcher.find()) {
            counter++;
        }
        System.out.println("Number of matches : " + counter);

    }
}
