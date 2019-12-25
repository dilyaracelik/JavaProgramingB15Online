package day12;

public class WakeUp_WeatherCode {
    public static void main(String[] args) {

      /*  Create a variable to store the weather of your city right now :
        And write a if else if else statement to do following
        If Weather Sunny ——>>  Code in Sunny weather
        If Weather Rainy ——>>  Code in Rainy weather
        If Weather Cloudy  ——>>  Code in Cloudy weather
        If Weather Snowy  ——>>  Code in Snowy weather
        Else   —>> rain or shine just keep coding anyway !!!*/




                String weather = "rainy";

        if (weather.equals("sunny")){
        System.out.println("Code in sunny weather..");}
        else if (weather.equals("rainy")) {
            System.out.println("Code in rainy weather..");
        } else if (weather.equals("cloudy")){
            System.out.println("Code in cloudy weather..");
        } else if (weather.equals("snowy")){
            System.out.println("Code in snowy weather..");}
          else {
            System.out.println("Rain or shine just keep koding anyway!");
        }












    }


}
