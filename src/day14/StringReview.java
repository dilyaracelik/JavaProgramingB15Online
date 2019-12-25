package day14;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class StringReview {
    public static void main(String[] args) {
        String str = "I like Pumpkin";
        //System.out.println(str.equals("pumpkin"));

//contains :
//it checks whether a string exist in another string.

        System.out.println("Does the sentence contain pumpkin?");
        System.out.println(str.contains("Pumpkin"));
                               //true
        boolean gotPumpkin = str.contains ("Pumpkin");

//shortcut to print variable value in a nice format, use soutv + tab
        System.out.println("gotPumpkin = " + gotPumpkin);;









    }
}
