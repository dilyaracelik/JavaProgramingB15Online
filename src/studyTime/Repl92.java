package studyTime;

import java.util.Scanner;

public class Repl92 {
    public static void main(String[] args) {
//        In mathematics, the factorial of a positive integer n, denoted by n!, is the product of all
//        positive integers
//        less than or equal to n.  Calculate factorial and output result to the console.

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
//n!= n
//5!= 5*4*3*2*1=120
long fact =1;
       for (int i = 1 ; i <= n ; i++) {
fact *= i;
        }
        System.out.println(fact);

    }
}
