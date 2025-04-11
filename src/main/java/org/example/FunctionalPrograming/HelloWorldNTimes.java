package org.example.FunctionalPrograming;

public class HelloWorldNTimes {
    public static void main(String[] args) {
        helloWorldNTimes(4);
    }

    static void helloWorldNTimes(int n) {
        if (n > 0) {
            System.out.println("Hello World");
            helloWorldNTimes(n - 1);
        }
    }
}
