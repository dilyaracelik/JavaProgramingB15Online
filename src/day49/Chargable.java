package day49;

public interface Chargable {


    public default void charge() {
        System.out.println("DEFAULT charge, " +
                "You may wanna do on your own");
    }

}