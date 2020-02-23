package thingsToRemember;

public class AvarageByMethodArray {
    public static void main(String[] args)
    {
        int[] a = {2,7,3,8,4};
        System.out.println(avgElements(a)); //should print 4.8
    }
    public static double avgElements(int[] array)
    {

        double sum = 0;
        //int average = 0;
        for (int i = 0; i<array.length; i++){
            sum = sum + array[i];
            double avarage = sum / array.length;

        }

        return sum/array.length;
    }}



