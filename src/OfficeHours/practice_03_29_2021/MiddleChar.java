package OfficeHours.practice_03_29_2021;

public class MiddleChar {
    public static void main(String[] args) {
        String word = "even";
        if (word.length() % 2 == 1){
            System.out.println(word.charAt(word.length()/2));
            System.out.println(word.charAt(word.length()/2));
            //odd
        }else {
            //even
            int index = word.length()/2;
            System.out.println(word.charAt(index-1) + "" + word.charAt(index));
            System.out.println(word.substring(index-1, index+1));
        }
    }
}
/*
[Middle char]
Given a String, write a program to display the middle character of a string
a) If the length of the string is even there will be two middle characters. b) If the length of the string is odd there will be one middle character.
Ex:
Input: elephant
Output: The middle characters: ph
 */
