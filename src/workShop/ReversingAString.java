package workShop;

public class ReversingAString {
    public static void main(String[] args) {

        java.lang.String str = "Batch 15";

        java.lang.String reversed = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            reversed += str.charAt(i);

        }
        System.out.println(reversed);

        //another way

//        public class StringReverse {
//            public static void main(String[] args) {
//                String s="abcdef";
//                char []arr=s.toCharArray();
//                for(int i=0;i<arr.length/2;i++){
//                    char temp=arr[i];
//                    arr[i]=arr[arr.length-1-i];
//                    arr[arr.length-1-i]=temp;
//                }
//                System.out.println(String.valueOf(arr));
 //           }
   //     }




    }
}
