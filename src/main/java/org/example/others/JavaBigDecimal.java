package org.example.others;

import java.util.Arrays;
import java.util.Scanner;

public class JavaBigDecimal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //Write your code here

        Arrays.sort(s, 0, n, (o1, o2) -> {
            if (o1 == null || o2 == null) {
                return 0;
            }
            java.math.BigDecimal o1BigDecimal = new java.math.BigDecimal(o1);
            java.math.BigDecimal o2BigDecimal = new java.math.BigDecimal(o2);
            return o2BigDecimal.compareTo(o1BigDecimal);
        });
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
/*
90  90
56.6    56.6
50  50
02.34   02.34
0.12    0.12
.12 .12
0   0
000.000 000.000
-100    -100
 */
