package day12;

public class LoginTest {
    public static void main(String[] args) {
/*String str = "abc" ;
    str.equals("abc") —> true       ! str.equals("abc") —>> false --> impt!!!
Create class called LoginTest with main method
   Create 2 String variable called userName , password
   and do following
  // your correct username password is  user123  and pass123
   Check if your username and password correct
  If so print login successful
  If not
     Check whether your username correct
	 if not print  , username is not correct
   Check your password is correct or not
      If not print password is not correct */




/*My way asagida.
    String userName = "user123";
        String password ="pass123";
        if (userName.equals("user123") && password.equals("pass123") ) {
            System.out.println("Login succesfull");
        } else if ( !userName.equals("user123") && !password.equals("pass123"))
        {System.out.println("USERNAME AND PASSWORD ARE BOTH WRONG !!");}
        else if (!userName.equals("user123") )
        {System.out.println("Username is not correct");
        } else if ( !password.equals("pass123")) {
            System.out.println("Password is not correct");
        }

     } */


// we can declare and assign value like this -->teachers way
        // if it's multiple variables of same type
        String userName = "user123", password = "pass123";

        // user123 , pass123

      //  System.out.println( ! userName.equals("user123")   );

        if (userName.equals("user123") && password.equals("pass123")) {

            System.out.println("Login Successful ");

        } else if (!userName.equals("user123") && password.equals("pass123")) {
            System.out.println("USERNAME NOT CORRECT!!!");

        } else if (userName.equals("user123") && !password.equals("pass123")) {

            System.out.println("PASSWORD NOT CORRECT");

        } else {
            System.out.println(" USERNAME AND PASSWORD ARE BOTH WRONG !!!!");
        }












    }

}
