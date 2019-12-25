package day11;

import java.util.Scanner;

public class WarmUpTask_LightTurnOn {
    public static void main(String[] args) {


       /* Create class called WarmUp1_LightOnOff
                Create a variable  targetOption as String and assign one of below options  for example bd
        You have 4 switches in your home to turn on
        Bd — bedroom
        Lr  — living room
        ki  — kitchen
        Ha— Hallway
        Use switch statement to write a program to print which room light is turned on
        For example if Bd was targetOption
        then print  you have turned on bedroom light*/


       //there is a
        String targetOption = "br";

        switch (targetOption) {


            case "br":
                System.out.println("You have turned bedroom light.");
                break;

            case "lr":
                System.out.println("You have turned livingroom light.");
                break;

            case "ki":
                System.out.println("You have turned kitchen light.");
                break;

            case "hl":
                System.out.println("You have turned hallway light.");
                break;
            default:
                System.out.println("There is no such a room.");


















        }






















    }



}
