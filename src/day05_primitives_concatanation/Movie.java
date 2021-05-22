package day05_primitives_concatanation;

import day02_println_practice.PrintingPractice;

public class Movie {
    public static void main(String[] args){
        String movie = "Dear Hunting";
        String release = "January 20th of 2020";
        byte rottenTomatoesRating = 55;
        byte duration = 90;
        String minutes = "Minutes";
        String genre = "hunting";
        String rating = "PG";
        boolean sequel = true;

        System.out.println("***********WELCOME TO THE CINEMA***********");
        System.out.println("Tonight we are Streaming:" +movie);
        System.out.println("witch was released on: " + release);
        System.out.println("this "+genre );
        System.out.println("movie a  rotten tomatoes rating of: " +rottenTomatoesRating);
        System.out.println("The rating is " + rating);
        System.out.println("and it runs for: " +duration);
        System.out.println("minutes: " +minutes);
        System.out.println("this is a sequel " + sequel);


    }
}
