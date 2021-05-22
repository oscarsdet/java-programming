package day18_conditions_practice_strings_intro;
import java.util.Scanner;
public class Authentication_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your last 4 digits of SSN number");
        int ssn = scan.nextInt();
        System.out.println("Enter your pin code");
        int pin = scan.nextInt();

        System.out.println("Your last 4 digits of SSN:");
        int ssn2 = scan.nextInt();
        System.out.println("Your pin code:");
        int pin2 = scan.nextInt();

        if (ssn == ssn2 && pin == pin2) {
            System.out.println("Login successful!");
        } else if (ssn != ssn2 && pin == pin2) {
            System.out.println("Your 4 digit of SSN is wrong");
        } else if (ssn == ssn2 && pin != pin2) {
            System.out.println("Your pin code is wrong");
        } else {
            System.out.println("Your both SSN and pin are wrong");
        }
    }
}