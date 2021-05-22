package OfficeHours.Practice_03_24_2021;

import java.util.Locale;

public class CharIndex {
    public static void main(String[] args) {
        /*
        Index
        java is
        0123456

        charAt(int) -> gives a char
        IndexOf (char) -> give a int  (index)

         */
        String s = "java";

       // System.out.println(s.charAt(s.length()));
        System.out.println(s.charAt(s.length()-1));// formula -1 to get last index StringIndexOutOfBoundsException

//        System.out.println(s.charAt(0));
//        System.out.println(s.charAt(1));
//        System.out.println(s.charAt(2));
//        System.out.println(s.charAt(3));

        System.out.println(s.charAt(0) + "" + s.charAt(3));




        String upper = "" + s.toUpperCase().charAt(0) + s.toUpperCase(Locale.ROOT).charAt(3);
        // JAVA
        System.out.println(upper);
        System.out.println(s.indexOf('a'));
        System.out.println(s.indexOf('m'));

        System.out.println(s.contains("j"));
        System.out.println(s.indexOf('j') >= 0 ? "contains " : "Not contains");
        System.out.println(s.indexOf('g') >= 0 ? "contains" : "Not contains");

        System.out.println(s.toLowerCase(Locale.ROOT).contains("a"));
        System.out.println(s.toLowerCase(Locale.ROOT).startsWith("a"));
        //boolean.String method
        System.out.println(s.toLowerCase(Locale.ROOT).replace("j", "e").startsWith("a"));

    }
}
