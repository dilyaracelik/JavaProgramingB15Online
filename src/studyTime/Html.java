package studyTime;

import java.util.Scanner;

public class Html {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String html =scan.nextLine();
        int start = html.indexOf("id"+4);
        int end = html.lastIndexOf("\"");


        if (html.contains("<") && html.contains(">")){
            System.out.println(html.substring(start,end));}else{

            System.out.println("Invalid input!");
        }

//        id="myid"></p></body></html>
//                output: myid

    }
}
