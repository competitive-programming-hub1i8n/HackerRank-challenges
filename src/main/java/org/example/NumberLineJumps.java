package org.example;

public class NumberLineJumps {
    public static void main(String[] args) {
        System.out.println(kangaroo(0, 3, 4, 2));
        System.out.println(kangaroo(0, 2, 5, 3));

    }

    /*
     * Complete the 'kangaroo' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER x1
     *  2. INTEGER v1
     *  3. INTEGER x2
     *  4. INTEGER v2
     */

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        if (v1 <= v2) {
            return "NO";
        }
        for (int i = 0; i < 10000; i++) {
            if (x1 + v1 * i == x2 + v2 * i) {
                return "YES";
            }
        }
        return "NO";

    }
}
