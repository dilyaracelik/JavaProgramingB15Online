package homeworks;

public class TasksMethod {
    public static void main(String[] args) {

        reversePrintAnyName();
        System.out.println();
        reversePrintOwnName();
        System.out.println();
        printLastCharacterOfName();
        System.out.println();
        printFullNameInformation();
        lengthOfTheFullName();
        compareNameCharacterCount();
        printAtoZ();
        System.out.println();
        printZtoA();

    }
//                * create a method that has no parameter
//        and print your name in reversed order
//                reversePrintAnyName
//* create a method that has 1 String parameter called name
//        and print that name in reversed order


    public static void reversePrintOwnName() {

        String name = "Berk";

        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.println(name.charAt(i));
        }


    }

    public static void reversePrintAnyName() {


//* create a method that has 1 String parameter called name
//        and print that name in reversed order

        String anyName = "Sevim";

        for (int i = anyName.length() - 1; i >= 0; i--) {
            System.out.println(anyName.charAt(i));
        }


    }

    public static void printLastCharacterOfName() {
//* create a method that has 1 String parameter called name
//        and print last character of that name

        String name = "Ufuk";
        int length = name.length() - 1;
        System.out.println("Last character of \"Ufuk\" is " + name.charAt(length) + ".");


    }

    public static void printFullNameInformation() {

//* create a method that has 2 String parameter called firstName,lastName
//        and print "Your first name is firstName , Your last Name is lastName

        String firstName = "Berk";
        String lastName = "Zini";
        System.out.println("First and last name: " + firstName + " " + lastName);

    }

    public static void lengthOfTheFullName() {
//        print " your full name lenth is lengthOfTheFullName"
        String name1 = "Berk";
        String lastName = "Zini";
        System.out.println("First name length " + name1.length() + ", last name length: " + lastName.length());

    }

    public static void compareNameCharacterCount() {
//                * create a method that has 2 String parameter called name1,name2
//        if name 1 has more characters
//        print " name 1 is longer "
//        if name 2 has more characters
//        print " name 2 is longer "
//        if name 2 has same character count
//        print " name 1 and name 2 same character count "

        String name1 = "Sevim";
        String name2 = "Berk";

        if (name1.length() > name2.length()) {

            System.out.println(name1 + " is longer. ");
        } else if (name2.length() > name1.length()) {

            System.out.println(name2 + " is longer.");
        } else {

            System.out.println("Both names have the same character.");
        }


    }

    public static void printAtoZ() {


//                * create a method that has no parameter
//        and print A-Z in one line

        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
        }

    }

    public static void printZtoA() {

//* create a method that has no parameter
//        and print Z-A in one line

        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.print(i + " ");

        }

    }

    public static void printAlphabetInRange(char beginning, char ending) {

//*create a method that have 2 char as parameters:
//        beginning, ending
//        if beginning character is before ending character
//        for example beginning A, ending D-- >> ABCD
//        if beginning character is after ending character
//        for example beginning D, ending A-- >> DCBA








    }
}


