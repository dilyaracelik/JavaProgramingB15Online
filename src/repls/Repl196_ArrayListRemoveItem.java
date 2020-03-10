package repls;

import java.util.ArrayList;

public class Repl196_ArrayListRemoveItem {
    public static void main(String[] args) {

//        As an example, say you had an ArrayList called nums with
//    values (6,2,3,1,9,2,5).  Running the following code:
//        nums.remove(1);
//        will result in (6,3,1,9,2,5).  Running the following code again:
//        nums.remove(3);
//        nums.remove(3);
//        will result in (6,3,1,5), because after the first remove(3) is
//    run, the 2 and 5 get pushed up into the 3rd and 4th index, and then the
//        second remove(3) will remove the 2, leaving the 5.
//        On the left, write code that will remove the first two elements
//        in an ArrayList of doubles (be careful, this is a little tricky!)
    }
    public static void test(ArrayList<Double> dubs)
    {
        //write code here
double first = dubs.get(0);
double second = dubs.get(1);
dubs.remove(first);
dubs.remove (second);
        System.out.println(dubs);







}


}
