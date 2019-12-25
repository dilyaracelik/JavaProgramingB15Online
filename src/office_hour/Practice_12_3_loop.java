package office_hour;

public class Practice_12_3_loop {
    public static void main(String[] args) {


        for (int jumpCount = 1; jumpCount <=100 ; jumpCount++) {
            System.out.println("I jumped " + jumpCount + " times.");
            
        }

        //I want to start from 3rd stairs and want to stop 7th stairs.
        //sing a song at each step, drink water, clap (do them at each level
        for (int stairsnumber = 3; stairsnumber <= 7; stairsnumber++) {
            System.out.println("Sing a song at stair number: " + stairsnumber);
            System.out.println("Drink water at stair number: " + stairsnumber);
            System.out.println("Clap at stair number: " + stairsnumber);
        }
//simply print 23-30
        for (int number = 23; number <=30 ; number++) {
            System.out.println("I am in level " + number);
        }
//I am in level 90, go down level 80

        for (int number = 90; number >=80; --number) {
            System.out.println(number);
        }

        for (int num = 1; num <= 10 ; num++) {
            if (num%2 ==0) {
                System.out.println(num);
            }



        }


    }
}
