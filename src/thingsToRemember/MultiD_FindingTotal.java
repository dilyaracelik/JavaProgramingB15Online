package thingsToRemember;

public class MultiD_FindingTotal {
    public static void main(String[] args) {

        int[][]  arr2D  = {  { 1, 2, 3} ,
                             { 4, 5, 6}  };

        int total = 0;

        for (int i = 0; i <arr2D.length ; i++) {
            for (int j = 0; j <arr2D[i].length ; j++) {
                total += arr2D[i][j];
            }
        }
        System.out.println(total);




















    }
}
