package day08_casting_scanner;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please Enter your Name:");

        String firstName = scan.next();

        System.out.print("Nice to Meet you, " + firstName);


    }
}
