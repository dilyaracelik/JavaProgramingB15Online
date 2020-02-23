package workShop;

public class tryCatchStudy {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        try {


            System.out.println(arr[5]);
            System.out.println("checked exception");

        } catch (ArrayIndexOutOfBoundsException s) {

            System.out.println("unchecked exception");

        }
        System.out.println("work done");
    }

}
