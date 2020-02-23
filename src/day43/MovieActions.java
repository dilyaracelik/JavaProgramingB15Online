package day43;

import day42.Movie;

public class MovieActions {
    public static void main(String[] args) {


        Movie m1 = new Movie("Joker", 2.2, "Drama");
        String str = "Joker";


        printMovieInformation(m1);

    }
        public static void printMovieInformation (Movie movieObj){
            //TODO YOUR CODE HERE

            System.out.println("Movie name is " + movieObj.getName());
            System.out.println("Movie is " + movieObj.getLength());
            System.out.println("Genre is " + movieObj.getType());


        }
    }
