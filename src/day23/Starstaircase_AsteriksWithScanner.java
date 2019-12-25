package day23;

import java.util.Scanner;

public class Starstaircase_AsteriksWithScanner {
    public static void main(String[] args) {

        int i = 1;
        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int x = 1; x <= n; x++) { // row
            for (i = 1; i <= x; i++) {   //column
                System.out.print("*");
            }
            System.out.println("");
        }
    }}