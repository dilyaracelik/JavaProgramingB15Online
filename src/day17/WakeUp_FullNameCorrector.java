package day17;

public class WakeUp_FullNameCorrector {
    public static void main(String[] args) {



        //                 0123456789
        String fullName = "arYa sTarK";

        String firstName = fullName.substring(0, 4); // arYa
        String lastName = fullName.substring(5);   // sTarK


        String firstNameCorrected =
                firstName.toUpperCase().substring(0, 1) +  // ARYA -->> A
                        firstName.toLowerCase().substring(1);    // arya --->> rya

        System.out.println(firstNameCorrected);

        String lastNameCorrected =
                lastName.toUpperCase().substring(0, 1) + // 0,1 den baslama nedeni 2 ayri string ve soyadida 0'dan basliyor
                        lastName.toLowerCase().substring(1);
        System.out.println(lastNameCorrected);

        fullName = firstNameCorrected + " " + lastNameCorrected;
        System.out.println(fullName);









    }

}
