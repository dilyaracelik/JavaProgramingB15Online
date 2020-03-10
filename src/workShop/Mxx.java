package workShop;

public class Mxx {
    public static void main(String[] args) {


        int [] arr = {1,32,4};
        int max= 999999999;
        for (int i = 0; i <arr.length ; i++) {
                  if(arr[i]<max){
                      max=arr[i];
                  }

        }
        System.out.println(max);


    }
}
