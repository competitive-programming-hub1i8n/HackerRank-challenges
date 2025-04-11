package org.example.others;
import java.util.Scanner;

public class Example_14 {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0, k);

        for (int i = 0; i <=s.length()-k ; i++) {
            String saveSubString = s.substring(i, i+k);
            if (saveSubString.compareTo(largest) > 0){
                largest = saveSubString;
            }
            if (saveSubString.compareTo(smallest) < 0){
                smallest = saveSubString;
            }
        }

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        System.out.println(getSmallestAndLargest(s, k));
    }
}
