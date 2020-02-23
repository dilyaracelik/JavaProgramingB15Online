package thingsToRemember;

public class Print_Hollow_Rectangle {
    public static void main(String[] args) {
//
//
//*****
//*   *
//*   *
//*   *
//*****
//
//        hint:you will need to use two nested for loops for that, and an if that
//    checks if its the last or
//        first iteration of the loop (so you will know whet to print "*" or " ")
//

        for (int i=1; i<=5; i++){  //size 5
            for(int j = 1; j<=5; j++){   //size 5
                if(i==1 || i == 5 || j == 1 || j == 5){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println(); //Jump to the next row








    }



}}
