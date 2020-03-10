package repls;

public class Repl174PrintUniqueNumbersofArray {
    public static void main(String[] args) {

        int[] nums = {2, 5, 5, 6, 3, 6, 9, 34, 3};

        for (int i = 0; i <nums.length ; i++) {
            int count = 0;  //define inside the loop, her sayi icin count bakiyor ve her defasinda sifirlamasi gerek
            for (int j = 0; j <nums.length; j++) {
                if (nums[i] ==nums[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.println(nums[i]);
            }
        }







    }}