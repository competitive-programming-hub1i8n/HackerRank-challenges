package org.example.others;

import java.util.BitSet;
import java.util.Scanner;

public class JavaBitSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m  = scanner.nextInt();
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);

        for (int i = 0; i < m; i++) {
            String op = scanner.next();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            operation(op, x, y, b1, b2);
            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }
    }
    static void operation(String op, int x, int y, BitSet b1, BitSet b2) {
        BitSet operator = (x == 1) ? b1 : b2;
        switch (op) {
            case "AND":
                operator.and((x == 1) ? b2 : b1);
                break;
            case "OR":
                operator.or((x == 1) ? b2 : b1);
                break;
            case "XOR":
                operator.xor((x == 1) ? b2 : b1);
                break;
            case "FLIP":
                operator.flip(y);
                break;
            case "SET":
                operator.set(y);
                break;
        }
    }
}
