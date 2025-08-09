package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ElectronicsShop {
    /*
     * Complete the getMoneySpent function below.
     */
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*
         * Write your code here.
         */
        int ans = -1;
        if (keyboards.length == 1 && drives.length == 1) {
            int sum = keyboards[0] + drives[0];
            if (sum <= b)
                ans = sum;
        }
        else if (keyboards.length > drives.length) {
            System.out.println("firs");
            ans = getAns(keyboards, drives, b, ans);
        }else {
            System.out.println("second");
            ans = getAns(drives, keyboards, b, ans);
        }

        return ans == 0 ? -1 : ans;
    }

    private static int getAns(int[] keyboards, int[] drives, int b, int ans) {
        Arrays.sort(keyboards);
        Arrays.sort(drives);
        int price = 0;
        System.out.println(keyboards.length);
        System.out.println(drives.length);
        for (int i = 0; i < keyboards.length; i++) {
            for (int drive : drives) {
                int sum = keyboards[i] + drive;
                if (sum <= b) {
                    price = Math.max(price, sum);
                }
            }
        }

        return price;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] bnm = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int b = Integer.parseInt(bnm[0]);

        int n = Integer.parseInt(bnm[1]);

        int m = Integer.parseInt(bnm[2]);

        int[] keyboards = new int[n];

        String[] keyboardsItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        for (int keyboardsItr = 0; keyboardsItr < n; keyboardsItr++) {
            int keyboardsItem = Integer.parseInt(keyboardsItems[keyboardsItr]);
            keyboards[keyboardsItr] = keyboardsItem;
        }

        int[] drives = new int[m];

        String[] drivesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        for (int drivesItr = 0; drivesItr < m; drivesItr++) {
            int drivesItem = Integer.parseInt(drivesItems[drivesItr]);
            drives[drivesItr] = drivesItem;
        }

        /*
         * The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
         */

        int moneySpent = getMoneySpent(keyboards, drives, b);
        System.out.println(moneySpent);

        scanner.close();
    }
}
