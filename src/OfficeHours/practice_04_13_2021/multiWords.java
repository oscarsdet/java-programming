package OfficeHours.practice_04_13_2021;
import java.util.*;
import java.io.OutputStream;

public class multiWords {
    public static void main(String[] args) {
        String words = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";
        String[] arrWords = words.split(", ");

        for (String eachWord : arrWords) {
            if (eachWord.contains(" ")) {
                System.out.println(eachWord);
            }
        }
    /*
    Multiple Words
Given a String of words that are separate by commas. Find and print any words
that have more than one word
Example
Input: "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge,
dish washer”
Output:
wooden spoons
trash can
dish washer
     */
    }
}
