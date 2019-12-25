package day11;

public class ScoreChecker {
    public static void main(String[] args) {

       /*
        Create a program to check the score   : ScoreChecker with main method
        Create a variable called score assign a value of your choice
        if the score is less than 0 or more than 100  —>> INVALID SCORE!!!!
                If the score is  100 —>> PERFECT SOCRE
        If the score is between 70-100  —>> YOU HAVE PASSED !
                Else you have failed !!!!!
                OPTIONAL :  add more condition for failing scores
        If the score is less than 20  —>. Come to my office
        If the score is between 30-40  —>. Attend additional classes
        If the score is between 40-70  —>. Little bit more study will let you pass
        */


        int score = 70;

      if (score <0 || score > 100 ){
        System.out.println("Invalid Score!!");}
      else if (score ==100 ) {
          System.out.println("Perfect Score!!");
      } else if ( score >= 70 && score < 100){
          System.out.println("You have passed!");
      } else if (score <20) {
          System.out.println("Come to my office.");
      } else if (score>30 && score<40){
          System.out.println("Attend additional classes");
      } else if (score >40 && score<70){
          System.out.println("You need to study more!");
      } else {

          System.out.println("You have failed...");
      }









    }

}
