package day22;

public class StringArrayFamNames {
    public static void main(String[] args) {

        //create a String array with size that you define
        //and store all your household member names.

        String [] familyMembers = new String [3];

        familyMembers[0]= "Berk";
        familyMembers[1]= "Ufuk";
        familyMembers[2]= "Sevim";

        System.out.println(familyMembers[0]);
        System.out.println(familyMembers[1]);
        System.out.println(familyMembers[2]);

// immutable means you can not change the internal structure of the object
// if you have String abc = "Hello"
// if you do abc.toUppercase -->> it will create new String object "HELLO"
// and it does not change original hello at all !!
// not resizable --> specifically for array
// we can not change the size of array once we create them with certain size
// However , we can change the elements inside this array
// and it means : IT IS NOT IMMUTABLE

    }
}
