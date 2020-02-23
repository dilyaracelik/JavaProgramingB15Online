package day26;

import java.util.Arrays;

public class SwappingValuesUsingTemp_Array2 {
    public static void main(String[] args) {
  String name1 = "Emma";
  String name2 = "Jason";
  //name2 should have Emma, name1 should have Jason.
  //Create temporary container, to put your original value so you don't lose it
        String tempContainer = name1; //orjinal value'yi kaybetmemek icin buraya koyuyorum
        name1= name2; //name1 become Jason.
        name2 = tempContainer; //Emma olur, orjinal value'yi kaybetmedik
        System.out.println("name 1 : " + name1);
        System.out.println("name 2 : " + name2);


        //ARRAY'DE NE ISE YARAR????
        //SWAP THE VALUE OF first and last item.
        int [] numbers = new int [] {10,40,30,7};
        int temp = numbers[0]; //temp now has 10
        numbers [0] = numbers[3]; //first item value is 7
        numbers[3] = temp;
        System.out.println("First item : " + numbers[0]);
        System.out.println("Last item : " + numbers[3]);

        //Array is an array, treat as an array not a string.
        System.out.println("numbers " + Arrays.toString(numbers));

        //swap value of 1 and 2.
        int tem2 = numbers [1];


        numbers [1] = numbers[2];
        numbers[2] = tem2;
        System.out.println("numbers " + Arrays.toString(numbers) );

// swap an array cut in the middle!!


    }
}
