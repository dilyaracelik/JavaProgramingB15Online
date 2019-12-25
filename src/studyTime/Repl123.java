package studyTime;

public class Repl123 {

    public static void main(String[] args) {


        int growth =1, size =0;
        for (int i = 1; i <=10 ; i++) {
           if (i>3) {

               growth=2;
           }
           size +=growth;
            System.out.println("year " + i + " - " + "growth " + growth +  " cm" );
            System.out.println("tree size: " + size + "cm");


        }

    }
}
