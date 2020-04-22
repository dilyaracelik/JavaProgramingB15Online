package BootCamp;

public class FrequencyOfAChar {

    public static void main(String[] args) {


        String ex = "Even as some countries tentatively lift coronavirus restrictions, "
                + "more than half the world’s population is still subject to some form of "
                + "mandatory confinement, and governments are facing pressure to ease lockdowns. "
                + "Protests have erupted from Paris and Mumbai to Beirut and Baghdad, and rallies "
                + "demanding the end of stay-at-home orders are spreading across the United States.";

        String[] frequency = ex.split("");
        int count = 0;

        for (String s : frequency) {
            if (s.toLowerCase().equals("e")) {
                count++;
            }
        }

        System.out.println("E is repeated " + count + " times");


    }
}
