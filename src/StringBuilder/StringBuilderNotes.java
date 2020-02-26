package StringBuilder;

public class StringBuilderNotes {
    public static void main(String[] args) {

        /*
         *StringBuilder --> mutable  - not thread safe - fast
         *StringBuffer --> synchronized - thread safe - very slow
         *       when object is synchronized it can be access by multiple threads
         *
         *  QA: if you know that you need to do some manipulations on String;
         *      which class you will use  ==> StringBuilder  or StringBuffer ?
         *
         *  Answer : it depends depends if we need any synchronization ;
         *
         *           if i don't need that object to be thread safe i go over StringBuilder it is faster
         *           but it can not be reached by multiple threads
         *
         *           if we need just to store some String we would always want to use String
         *
         * Multithreading - StringBuffer and StringBuilder.
         * If your text can change and will only be accessed from a single thread,
         * use a StringBuilder because StringBuilder is unsynchronized.
         * If your text can changes, and will be accessed from multiple threads,
         * use a StringBuffer because StringBuffer is synchronized
        =============================================================================================
        * String StringBuilder StringBuffer
String - class in Java (immutable)
Heap - String Pool
String str1 = "abc";       []
String str2 = "abc"; ----->
str1 = "abcd"; -----> []
str2? --> abc
StringBuilder --> mutable
StringBuffer --> synchronized
StringBuilder sb1 = new StringBuilder("word");
StringBuilder sb2 = sb1;
sb1 --- [word]
sb2 ---
sb1 = new StringBuilder("java");
sb2?
sb1 --- [java]
sb2 --- [word]
If you know that you need to do some manipulations
on String which class you will use?
-StringBuilder or StringBuffer depends if we need
any synchronization
If need just to store some String we would alway want to use
String class
StringBuilder sb3 = new StringBuilder("selenium");
sb3 -- [selenium]
sb3 = sb3.reverse();
sb3 -- [muineles]
String str1 = "abc"; str1 --[abc]
str1 = str1.toUpperCase();  str1   [abc]< garbage collected
                            str1 -- [ABC]


         */


    }
}