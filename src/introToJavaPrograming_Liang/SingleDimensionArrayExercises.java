package introToJavaPrograming_Liang;

public class SingleDimensionArrayExercises {
    public static void main(String[] args) {

//7.3, page 252
int x = 30;
int [] numbers = new int [x];
 x=60;
        System.out.println("x is " + x); //result 60
        System.out.println("The size of the array is " + numbers.length); //result 30, size can not be changed

        System.out.println("----------------------------------------------------");


int [] nums = {1,2,4,5};
int sum =0;


        for (int i = 0; i <nums.length ; i++) {
         sum += nums[i];


        }
        System.out.println(sum/nums.length); //avarage bulur

    }
}
