package day09_scanner_practice;
import java.util.Scanner;
public class CentsToDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Cents:");
        //int cents = 255;
        int cents = scan.nextInt();// keyboard input
        int dollars = cents / 100;
        int remainingCents = cents % 100;
        System.out.println("cents = " + cents);
        System.out.println("dollars = " + dollars);
        System.out.println(" RemainingCents = " + remainingCents);
        System.out.println(" in " +cents+ " Cents: " +dollars+ " dollars " +remainingCents+ " cents ");
        /*
        REFACTORING THE CODE.
        update existing working code, in order to improve it, or add additional features
        Different then DEBUGGING THE CODE: LOOKS FOR DEBUG
         */

        /*
        cents -> 123
dollars -> 1
remainingCents -> 23

print:
in 123 cents : 1 dollars 23 cents

         */
    }
}
