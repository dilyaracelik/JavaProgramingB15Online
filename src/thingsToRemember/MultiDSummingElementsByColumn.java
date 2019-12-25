package thingsToRemember;

public class MultiDSummingElementsByColumn {
    public static void main(String[] args) {

        int[][]  arr2D  = {  { 1, 2, 3} ,
                             { 4, 5, 6}  };

        for (int i = 0; i <arr2D[0].length ; i++) {
            int total=0;
            for (int j = 0; j <arr2D.length ; j++) {
             total += arr2D[i][j];
                System.out.println("Sum for " + i + " is " + total );
            }
        }
















    }
}
