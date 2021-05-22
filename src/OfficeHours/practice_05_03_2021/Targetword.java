package OfficeHours.practice_05_03_2021;

import java.util.ArrayList;
import java.util.Arrays;

/*
Target word
Given an ArrayList of Strings and a target word (String) print how many
times the target word is in the ArrayList
Ex:
Input:
”java”, ”html”, “css”, “java”, “javascript”, “selenium”
Target: java
Output:
2Count Letters (Similar to Target word, but
different layer)
Given an ArrayList of Strings and a letter (char) print how many times
the letter is found in the ArrayList elements
Ex:
Input:
”java”, ”html”, “css”, “java”, “javascript”, “selenium”
letter: ‘a’
Output:
6
 */
public class Targetword {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("java", "html", "javascript", "java", "word"));

        String targetWord = "java";

        int count = 0;

        for (String word : words){
            if(word.equals(targetWord)){
                count++;

            }
        }
        System.out.println(targetWord + " was found  " + count + " times");
    }

}
