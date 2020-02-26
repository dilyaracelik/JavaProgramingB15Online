package StringBuilder;

public class StringStringBufferDurga {
    public static void main(String[] args) {

        //String is immutable
        String s = "Love";
        s.concat("Java!");
        System.out.println("s = " + s);

        System.out.println("=================================");

        //String buffer is mutable
        StringBuffer sb = new StringBuffer("Love ");
        sb.append("Java!");
        System.out.println("sb = " + sb);

        System.out.println("=================================");
//equals method is for content comparion here
        String str = new String("Sevim");
        String str1 = new String("Sevim");
        System.out.println(str == str1);  //false
        System.out.println(str.equals(str1)); //true

        System.out.println("=================================");
//equals method is for reference comparison here
        StringBuffer sb1 = new StringBuffer("Love ");
        StringBuffer sb2 = new StringBuffer("Love ");
        System.out.println(sb1 == sb2); //false
        System.out.println(sb1.equals(sb2)); //false


    }
}
