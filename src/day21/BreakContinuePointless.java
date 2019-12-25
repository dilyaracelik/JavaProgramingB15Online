package day21;

public class BreakContinuePointless {
    public static void main(String[] args) {

        for (int x = 0; x <= 5 ; x++) {

            System.out.println(x);

            if (x==5){
                break;//this is also useless, after the 5th iterationthe loop will stop by itself!
            }
            continue; // it doesn't make sense since we're out of the loop.
            //after each iteration it's going to next iteration anyway.Doing nothing..
        }



    }
}
