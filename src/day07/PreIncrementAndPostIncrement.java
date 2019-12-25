package day07;

public class PreIncrementAndPostIncrement {
    public static void main(String[] args) {

        //Increment and decrement operator ++  --  has two version
        //Pre-increment   ++score
        //Post increment  score++

        //Pre- decrement   --score
        //Post decrement  score--

        //int apple = 8 ;
        //apple ++; // incrementing by 1

        //System.out.println(apple); // 9 // printing increase value

       // System.out.println(++apple);  //increasing the value and print the value

        //System.out.println(apple++);
        //System.out.println(apple);

        int score =50;
        System.out.println(score++); //51
        System.out.println(score++); //burada da 51 olur next time 52 show up
        System.out.println(score); //52
        System.out.println(--score); //51
        System.out.println(score--);  //value next time cikar burada, ready to be 50 next time it shows up
        System.out.println(score); //50


        //isaret  sonda olursa post olursa next lineda value gosterir. post zoorsa pre kullan her zmn
    }




}
