package day14;

public class TrimAndIsEmpty {
    public static void main(String[] args) {

        String message = "               Repl is coming !   ";
        System.out.println(message);
        System.out.println("Message character count is " + message.length());
//spacelerden dolayi cok character number cikti.

        message = message.trim();
        System.out.println(message);
//        System.out.println(message.trim());

        System.out.println("Message character count is " + message.length());


//trim method is used to take out spaces on 2 sides not in between.

        System.out.println(message.isEmpty()); //bos mu degil mi degil







    }
}
