package thingsToRemember;

import java.util.ArrayList;
import java.util.List;

public class RemovingTheLastDash {
    public static void main(String[] args) {


        //ArrayList<String> teamMates = new ArrayList<>();
        List<String> teamMates = new ArrayList<>();

        teamMates.add("Akbar");
        teamMates.add("Kuzzat");
        teamMates.add("Murodil");
        teamMates.add("Maruf");
        teamMates.add("Vasyl");
        teamMates.add("Muhtar");



        for (int i = 0; i < teamMates.size(); i++) {
            if (!(i==teamMates.size()-1)){
                System.out.print(teamMates.get(i) + "-"); //son kisiye kadar ekliyor
            }
        }
       System.out.print(teamMates.get(teamMates.size()-1)); //bu da son kisiyi ekliyor
    }
}
