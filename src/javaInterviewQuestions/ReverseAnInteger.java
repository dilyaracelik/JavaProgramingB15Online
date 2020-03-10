package javaInterviewQuestions;

public class ReverseAnInteger {

    public static void main(String[] args) {


        int num = 1234;
        int reversed=0;  //store all my reversed numbers here

        while(num!= 0){ // while num not equal to 0
//any number divided by 10 will give the last digit
        reversed= reversed*10 + num%10;   //reversed is 0 -> 0*10= 0 +  num%10= 4 = result is 4, I have 4 here
         //this will eliminate the last digit
            num = num/10; //123 olur, 4 is eliminated
        }
        System.out.println("reversed = " + reversed);


        System.out.println("================================");

//Using StringBuffer class


        StringBuffer s1 = new StringBuffer(String.valueOf(5678));
      //  System.out.println(s1.reverse()); this also works
       StringBuffer reverse = s1.reverse();
        System.out.println("reverse = " + reverse);

        System.out.println("=========================");
        //Another way

        String rev = "";
        int num1 = 2478;
        String nums = String.valueOf(num1);

        String [] arr = nums.split("");
        for (int i = arr.length-1; i >=0 ; i--) {
            rev += arr[i];

        }

        System.out.println(rev);

    }
}
