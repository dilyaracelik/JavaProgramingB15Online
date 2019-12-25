package day14;

public class EmailChecker {

    public static void main(String[] args) {



/*Create a class called EmailChecker with main method:
create a variable called email
check for below conditions
if it does not contain character @  say invalid email
if it contain space say invalid email
if it endsWith @gmail.com  -->> gmail
if it endsWith @yahoo.com  -->> yahoo email
if it endsWith @mail.ru  -->> russian email*/




String email = "abc@gmail.com";

if (!email.contains ("@") || email.contains(" ") ){
    System.out.println("Invalid email");

} else if (email.contains("@gmail.com")){

    System.out.println("Google mail");

        } else if (email.contains("@yahoo.com")){

    System.out.println("Yahoo mail");
} else if (email.contains("@hotmail")){

    System.out.println("Hotmail");}













    }
}
