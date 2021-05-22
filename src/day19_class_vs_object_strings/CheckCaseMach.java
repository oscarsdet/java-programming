package day19_class_vs_object_strings;

import java.util.Locale;

public class CheckCaseMach {
    public static void main(String[] args) {
        String countryCode = "KG";
        {// "usa"                ==     < convert to USA    >
            if (countryCode.equals(countryCode.toUpperCase())) {
                System.out.println("pas - case is correct");
            } else {
                System.out.println("fail - case is incorrect");
            }
            }
            String word2 ="java21";
        String uword = word2.toUpperCase();
        System.out.println(word2);//java21
        System.out.println(uword);//JAVA21

        if (word2.equals(uword)){
            System.out.println(uword);
        }

        }
    }