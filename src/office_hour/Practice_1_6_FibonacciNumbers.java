package office_hour;

public class Practice_1_6_FibonacciNumbers {
    public static void main(String[] args) {

//repl162




    }

    public static void fib(int num){

        int num1=0;
        int num2=1;

        int result =0;

        if (num ==0){
           result=0;
        } if (num==1){
            result=1;
        }
        for (int i = 2; i <=num ; i++) {  //2den saymaya basliyr o yuzden 2, oncekiler degismedigi icin 2den

            result= num2+num1;
            num1=num2;
            num2=result;
        }
        System.out.println(result);


    }
}
