package day16;

public class Count1To10 {

    public static void main(String[] args) {
        int counter = 1;
        while(counter<11) {          //(counter<=10)da olur

            System.out.println(counter + ",");
            ++counter; //bunu koymazsan infinite loop olur, zararli pc'ye!!
        }













    }
}
