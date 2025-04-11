package org.example.others;

import java.util.Scanner;

public class JavaRegex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String pattern = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])\\." +
                "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])\\." +
                "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])\\." +
                "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
        while (in.hasNext()) {
            String ip = in.next();
            System.out.println(ip.matches(pattern));
        }
    }

}
