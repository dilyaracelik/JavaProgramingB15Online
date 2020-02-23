package thingsToRemember;

public class Array_ReturningTheLongestName {
    public static void main(String[] args) {
        
    
    String [] str = {"Sevim", "Berk", "Ufuk", "Serpil", "Gulcennet"};
    int max= 0;
String longest = "";

        for (int i = 0; i <str.length ; i++) {
            if (str[i].length()> max){
                max=str[i].length();
               longest = str[i];

            }
        }
        System.out.println(max);
        System.out.println(longest);


    }}
