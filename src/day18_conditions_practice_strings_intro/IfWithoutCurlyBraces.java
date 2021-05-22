package day18_conditions_practice_strings_intro;

public class IfWithoutCurlyBraces {
    public static void main(String[] args) {
        String todayClass = "python";
        if (todayClass.equals("java")) {
            //  System.out.println("java is fun"); curly brace is need when there is more than one statement
            System.out.println("java is fun again");
        } else
            System.out.println("is it not java. it is " + todayClass + " class");

        int a = 1;
        if (a == 1) {
            System.out.println("a is 1");

            System.out.println("1 is a");
        }

    }
}

