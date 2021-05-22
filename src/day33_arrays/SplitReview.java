package day33_arrays;

import java.util.Arrays;

public class SplitReview {
    public static void main(String[] args) {
        String word = "java";
        String [] array = word.split("a");
        System.out.println(array.length);

        System.out.println(array.length-1);//2
        int countOfA = array.length - 1 ;
        if (word.endsWith("a")){// if ends with a, add one more
            countOfA++;

        }
        System.out.println("countOfA = " + countOfA);
        //todo NOTE: please do not use this approach to count occurrences of characters of string is a string .
        // when split values ends in string, result needs adjustment .  instead use loop approach
        System.out.println(" ____Split with empty string________");
        String[] strArr = word.split("");
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        System.out.println(strArr[2]);
        System.out.println(strArr[3]);

         String word2 = "java1sql2html";
         String[] strArr2 = word2.split("\\d");
        System.out.println(Arrays.toString(strArr2));

        System.out.println("_____ password validation_______");
        String password = "bcTd123_5";
        if(password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^_&+=]).*$")) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
        }


    }

