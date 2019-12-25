package day10;

public class SeasonAction {
    public static void main(String[] args) {

        /*
         * What do you do in each season
         *
         * Spring -->>> Hike ! Easter , Nawruz, Blossom
         * Summer -->>> Swim , Vacation , BBQ , Holiday
         * Fall   -->>> Black Friday , Hiking , Harvest , Halloween , Shopping
         * Winter --->> Snowboarding , Ski , Chritmas , New Year
         *
         * */
        String season  = "fall" ;
        // byte , short , int , char , String
        switch(season){

            case "Spring" :
                System.out.println("Hike ! Easter , Nawruz, Blossom");
                break;
            case "Summer" :
                System.out.println("Swim , Vacation , BBQ , Holiday");
                break;
            case "Fall" :
                System.out.println("Black Friday , Hiking , Harvest , Halloween , Shopping");
                break;
            case "Winter" :
                System.out.println("Snowboarding , Ski , Chritmas , New Year");
                break;
            default:
                System.out.println("Coding time..."); ///default part is optional,
                //the break is also optional for default part, bec after
                // default the switch statement finish
        }
//switch is for only == (equality) statementes but
// "if else" can be used for all statements such as <, >, >=, etc




















    }








}
