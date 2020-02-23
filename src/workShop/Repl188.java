package workShop;

public class Repl188 {
    public static void main(String[] args) {


        double [] nums = {2,3,4,5.0};
        System.out.println(findMax(nums));



    }

public static int findMax(int[] nums) {

        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;

    }

    public static double findMax(double[] nums2) {

        double max = nums2[0];
        for (int i = 0; i < nums2.length ; i++) {
            if(nums2[i]>max){
            max=nums2[i];
            }
        }
    return max;
    }}
