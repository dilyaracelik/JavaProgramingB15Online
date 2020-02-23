package homeworks;

public class AnotherExcel {
    public static void main(String[] args) {

        int[][] cells2D = { {78, 54, 100, 84}, {33, 44, 77, 123}, {12, 88, 52, 76},
                {67, 33, 98, 67}, {12, 88, 52, 45}, {67, 33, 98, 34}};

        for (int  i = 0; i < cells2D.length ; i++) {
            for (int j = 0; j < cells2D[i].length ; j++) {
                System.out.print("Cell(" + (i+1) + "," + (j+1) + ")= " + cells2D[i][j] + "   ");

            }
            System.out.println();
        }

    }
}
