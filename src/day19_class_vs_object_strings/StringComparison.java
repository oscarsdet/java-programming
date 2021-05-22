package day19_class_vs_object_strings;

import java.util.zip.CheckedInputStream;

/**
 * STRING MANIPULATION:
 *     -> using String methods to process the "value"
 *
 * add new package day19_class_vs_object_strings
 * add new class StringComparison
 * main method
 *
 * String variable city and assign value
 *
 * equals()
 * equalsIgnoreCase()
 */
public class StringComparison {
    public static void main(String[] args) {
        String city = "Chicago";
        //EQUALS() CASE SENSITIVE COMPARISON
        System.out.println(city.equals("Chicago"));//true
        System.out.println(city.equals("chicago"));//false
        System.out.println(city.equals("Chicago "));//false

        // EQUALSIGNOREASE() method- CASE INSENSITIVE COMPARISON
        System.out.println(city.equalsIgnoreCase("Chicago"));// true
        System.out.println(city.equalsIgnoreCase("CHICAGO"));//true
        System.out.println(city.equalsIgnoreCase("ChiCago"));//true
        System.out.println(city.equalsIgnoreCase("Chiicago"));//false
        System.out.println(city.equalsIgnoreCase("chi cago"));//false

        if(city.equals("CHICAGO")) {
            System.out.println("equals() true");
        }else{
            System.out.println("equals() false");
        }

        if(city.equalsIgnoreCase("CHICAGO")) {
            System.out.println("equalsIgnoreCase() true");
        }else {
            System.out.println("equalsIgnoreCase() false");
        }
        }

    }

