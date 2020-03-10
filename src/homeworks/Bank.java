package homeworks;

public class Bank {

//    Task:
//    create class bank:
//    actions: interast rate calculation
//    InterestCalculator(){}
//    create sub classes:
//    BOA: interest rate ==> 3%
//    CapitalOne: interest rate ==> 4%
//    Citi: interest rate ==> 5%

    public void interestRate() {
        System.out.println("Default interest rate: 6 percent");
    }
}
class BOA extends Bank {
    public static void main(String[] args) {
        System.out.println("Interest rate is: 3 percent");

    }
}
class CapitalOne extends Bank {
    public static void main(String[] args) {
        System.out.println("Interest rate is: %4");

    }
}

class Citi extends Bank {
    public static void main(String[] args) {
        System.out.println("Interest rate is: %5");
    }

}