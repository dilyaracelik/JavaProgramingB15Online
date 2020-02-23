package thingsToRemember;

public class StringEquality {
    public static void main(String[] args) {


        String str1 = "java";  // String literal - Object is in heap-String pool.
        String str2 = new String("java"); // burada object farkli yerde, heap'te

        System.out.println(str1 == str2); //burada memory location etc, herseye baktigi icin false.
        // Farkli yerde object olusturdular
        System.out.println(str1.equals(str2)); //burada face value bakiyor, o yuzden true



        int i = 0;
        for (i = 5; i < 10; ) {
            i += 2; //7+2=9+2=11
        }
        System.out.println(i);

    }
}
