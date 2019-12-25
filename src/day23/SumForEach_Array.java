package day23;

public class SumForEach_Array {
    public static void main(String[] args) {

        long[] salaries = new long[]{100000L, 200000L, 150000L, 115000L, 60000L};
        long max = salaries[0];

        long sum = 0;

        for (long salary : salaries) {

            sum+=salary;
        }
        System.out.println("sum = " + sum);

        
        int [] numbers = {1,2,3,4,5};
        int sum1 = 0;
        for (int eachNumber : numbers) {
            sum1 = sum1 + eachNumber; //sum1 += eachNumber; --> bu da olur.
        }

        System.out.println("sum1 = " + sum1);



    }
}
