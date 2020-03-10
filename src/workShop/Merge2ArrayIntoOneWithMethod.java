package workShop;


import java.util.Arrays;

public class Merge2ArrayIntoOneWithMethod {
    public static void main(String[] args) {

        int [] a= {1,2,3};
        int [] b= {5,6,7};

        System.out.println(Arrays.toString(mergR(a,b)));



    }
    public static int[] mergR(int[] a,int[] b) {
        int lengthA = a.length;
        int lengthB = b.length;

        int[] merge = new int[lengthA + lengthB];
        int z = 0;
        for (int i = 0; i < a.length; i++) {
            merge[z] = a[i];
            z++;

        }

        for (int i = 0; i < b.length; i++) {
            merge[z] = b[i];
            z++;
        }
return merge;
    }



        }




