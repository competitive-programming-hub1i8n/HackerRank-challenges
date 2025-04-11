package org.example.DataStructures;

import java.util.Scanner;

public class Example_2 {
    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        boolean valueReturn = false;
        int i = 0;
        if(game[i+1] == 0){
            i++;
        }if(game[i+leap] == 0 && i+leap < game.length){
            i+=leap;
        }if(i == game.length || i+leap >= game.length-1){
            valueReturn = true;
        }if(i > game.length){
            valueReturn = true;
        }if(game[i-1] == 0 && i >= 0){
            i--;
        }
        return valueReturn;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
