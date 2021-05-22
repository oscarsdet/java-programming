package day35_methods_with_param;
import java.util.*;
public class Counters {
    public static void main(String[] args) {
        count(5);
        count(7);
        count(2);

        int num2 = 99;
        count (num2);

        String word = "wooden spoon";
        count(word.length());

        printAge(1978);

        printAge(1988);

        int birthYear = 2001;
        printAge(birthYear);

    }

    public static void count(int num) {
        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    /**
     * method name: printAge
     * @param/input: int year
     * Birth year: 1978. Age:
     */
    public static void printAge(int year){
        int age = 2021- year;
        System.out.println("Birthday year is : " +year+ " Age is: " + (2021-year));

    }


}
