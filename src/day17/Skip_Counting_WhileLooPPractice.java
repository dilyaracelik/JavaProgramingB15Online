package day17;

public class Skip_Counting_WhileLooPPractice {
    public static void main(String[] args) {

    //Skip counting by 3 from 0 till 30
    //Start from 3 6 9 12 15 18 21 24 27 30

        int counter = 0;
        while (counter<30){

            counter += 3; //bunu uste alirsak zero cikmaz
            System.out.print(counter + " ");
       // counter=counter+3;
            counter += 3;
            System.out.print(counter + " ");


            }


    }
}
