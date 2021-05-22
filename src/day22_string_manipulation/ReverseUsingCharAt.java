package day22_string_manipulation;

import java.util.Locale;

public class ReverseUsingCharAt {
    public static void main(String[] args) {
        String word = "Anna";

        System.out.print(word.charAt(3));
        System.out.print(word.charAt(2));
        System.out.print(word.charAt(1));
        System.out.println(word.charAt(0));
        System.out.println(word);
        // print using single statement and concatanation +
        System.out.println(""+word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0));

        String reversed = ""+word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0);
        System.out.println("word = " + reversed);
        System.out.println("word2 = " +reversed);

        if (word.equalsIgnoreCase(reversed)){
            System.out.println("palindrome word");
        }else{
            System.out.println("Not palindrome word");
        }

       // System.out.println(word.charAt(0)+ ""+word.charAt(1)+""+word.charAt(2)+""+word.charAt(3));

        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));
        System.out.println(word);

        System.out.println(word.toUpperCase(Locale.ROOT));word.toUpperCase();



    }
}
