package Day09;

public class DayPrinterWithSwitchStatement {

    public static void main(String[] args) {

        /*
        create a variable called dayCode as int
        *  if the dayCode is 1 --->> Monday
        *  if the dayCode is 2 --->>Tuesday
        *  if the dayCode is 3 --->>Wednesday
         * if the dayCode is 4 --->>Thursday
         * if the dayCode is 5 --->>Friday
         * if the dayCode is 6 --->>Saturday
         * if the dayCode is 7 --->>Sunday
         * if none of the above just print unknown day
         *
        * */

        //just 1 curly branches // switch check exact value of a certain condition,
        // 100>7 kontrol etmek icin if kullan



        int dayCode = 7;

        switch (dayCode) {
            case 1:
                System.out.println("Day is Monday");
                break;  //used to get out of this branch
            case 2:
                System.out.println("Day is Tuesday");
                break;
            case 3:
                System.out.println("Day is Wednesday");
                break;
            case 4:
                System.out.println("Day is Thursday");
                break;
            case 5:
                System.out.println("Day is Friday");
                break;
            case 6:
                System.out.println("Day is Saturday");
                break;
                case 7:
                System.out.println("Day is Sunday");
                break;
            case 8:
                System.out.println("Day is unknown");
                break;




        }


    }
}
