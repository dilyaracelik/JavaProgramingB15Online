package studyTime;

public class Repl91LetterCombinations {
    public static void main(String[] args) {

//        Write a loop that displays all possible combinations of
//        two letters where the letters are 'z', or 'y', or 'x', or 'w', or 'v'.
//                The combinations should be displayed in descending alphabetical order:
//
//        zz
//                zy
//        zx
//                zw
//        zv
//                yz
//....
//        vv

        //use for char, start looping from z to v then with another loop start looping
        //from char v to z. then print the combinations.

        for(char i ='z'; i>='v' ; i--){
            for (char j = 'z'; j >= 'v'; j--){


                System.out.println(""+ i+j);

            }

        }

    }}

