package office_hour;

public class Practice_11_26_3 {
    public static void main(String[] args) {

 //If the season is spring, summer, fall --> print this "bear is active"
 // if winter --> bear is sleeping

/*String season = "spring";
if (season.equals("spring") || season.equals("summer") || season.equals("fall") ) {
    System.out.println("Bear is active");
} else if (season.equals("winter")) {
    System.out.println("Bear is sleeping");
}*/


//ANOTHER VERSION WITH SWITCH

        //hepsi ayni oldugu icin sout ve breaki silebiliriz. we didn't repeat ourselves.
        String season = "summer";
        switch (season){

            case "spring":
            //    System.out.println("Bear is active");
              //  break;
            case "summer":
               // System.out.println("Bear is active");
               // break;
            case "fall":
                System.out.println("Bear is active");
                break;
            case "winter":
                System.out.println("Bear is sleeping");
            break;







        }








    }
}
