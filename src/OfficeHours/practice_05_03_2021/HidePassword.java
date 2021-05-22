package OfficeHours.practice_05_03_2021;
/*
Hide Password
Given an array of passwords (String). Hide each password as a star (*)
and show the hidden password
Ex:
Input:
{"one", "hi", "hold}
Output:
[ ***, **, **** ]
 */
import java.util.ArrayList;
import java.util.Arrays;

public class HidePassword {
    public static void main(String[] args) {

        String[] password = {"one", "apple", "hold"};
        ArrayList<String> hiddenPassword = new ArrayList<>();

        for (String each : password){
            hiddenPassword.add(convertToStars(each));

            System.out.println("Originia:  "+ Arrays.toString(password));
            System.out.println("hidden: " + hiddenPassword);


        }

    }
    // helper method: method that does some action , and its called somewhere
    public static String convertToStars(String str){
        String stars = "";

        for (int i=0; i < str.length(); i++){
            stars +=  "*";
        }
        return stars;

    }

}
