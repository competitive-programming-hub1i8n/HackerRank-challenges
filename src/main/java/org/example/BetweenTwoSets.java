package org.example;

import java.util.List;

public class BetweenTwoSets {
    public static void main(String[] args) {
        System.out.println(getTotalX(List.of(2, 6), List.of(24, 36)));
        System.out.println(getTotalX(List.of(2, 4), List.of(16, 32, 96)));
        System.out.println(getTotalX(List.of(100, 99, 98, 97, 96, 95, 94, 93, 92, 91), List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
    }

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        int lcm = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            lcm = LCM(lcm, a.get(i));
        }

        int gcd = b.get(0);
        for (int i = 1; i < b.size(); i++) {
            gcd = GCD(gcd, b.get(i));
        }

        int count = 0;
        for (int i = lcm; i <= gcd; i += lcm) {
            if (gcd % i == 0) {
                count++;
            }
        }

        return count;
    }

    /**
     * @Description: This function returns the LCM (Least Common Multiple) of two numbers a and b using recursion.
     * @Date: 2024/6/26 16:28
     * @param a
     * @param b
     * @param temp
     * @return the LCM of a and b
     */
    static int LCM(int a, int b, int temp) {
        if (temp % a == 0 && temp % b == 0) {
            return temp;
        }
        return LCM(a, b, temp + 1);
    }

    /**
     * @Description: This function returns the LCM (Least Common Multiple) of two numbers a and b using recursion.
     * @Date: 2024/6/26 16:28
     * @param a
     * @param b
     * @return the LCM of a and b
     */
    static int LCM(int a, int b) {
        return (a * b) / GCD(a, b);
    }

    /**
     * @Description: This function returns the GCD (Greatest Common Divisor) of two numbers a and b using recursion.
     * @Date: 2024/6/26 16:28
     * @param a
     * @param b
     * @return the GCD of a and b
     */
    static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return GCD(b, a % b);
    }
}
