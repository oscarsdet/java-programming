package day10_shorthand_Operators;

import java.util.Scanner;

public class WeatherToday {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.println("How is the Weather Today?");
//        String wToday = scan.next();
//        System.out.println(wToday + " is a nice day today!");
        System.out.println("How is the Weather Today?");
//        String weather = "Sunny";
//        String weather2 = "Cold";
//        String weather = scan.next();
          String weather = scan.nextLine();
        System.out.println(weather + " - is a Nice Day!");
    }
}
