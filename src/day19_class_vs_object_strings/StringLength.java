package day19_class_vs_object_strings;

import java.util.Locale;

public class StringLength {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word);
        System.out.println(word.length());
        System.out.println("count : " +word.length());
        System.out.println("wooden spoon: ".length());

        String firstname = "Nadir";
        System.out.println(firstname + " - " +firstname.length());

       int  count=firstname.length();
        System.out.println("count =" + count);

        String password = "abc123";
        /**
         * IF STATEMEN :
         * When password is at least 6 characters:
         * print : valid amazon password
         * else
         * print : password too short
         */

        String password1 ="abc123";
        if (password1.length()>=6) {
            System.out.println("valid amazon  password");
        }else{
            System.out.println("password must be 6 characers");
        }



    }
}
