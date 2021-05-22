package OfficeHours.practice_03_23_2021;
/**
 * Given the following information: hourly rate, weekly hours, and number of weeks. Check if all the inputs are valid and then calculate the salary.
 * - hourly rate cannot be negative or zero
 * -> If invalid print: Hourly Rate cannot be Negative or Zero
 * - weekly hours cannot be zero, negative or more than 65
 * -> If invalid print: Weekly Hours cannot be less than 1 or greater than 65
 * - number of weeks cannot be less than 1 and more than 52
 * -> If invalid print: Number of weeks cannot be less than 1 or greater than 52
 * Equation: salary = hourly rate * weekly hours * number of weeks
 */
import java.util.Scanner;
public class theSalaryCalculator {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();

        if (num > 0) {
            // pos
            System.out.println("Enter a single word");
            String word = input.next();

            if (word.length() % 2 == 0) {
                System.out.println(word + " is even length");
            } else {
                System.out.println(word + " is odd length");
            }

        } else {
            // neg

            System.out.println("Enter a character");
            char letter = input.next().charAt(0);

            /*
        [Character Checker]
        Given a letter (char) determine if the character is an uppercase letter or lowercase letter Ex: 'b' --> lowercase
        'G' --> uppercase 'O' --> uppercase
        Hint: Use the ASCII table
             */

            if (letter >= 'A' && letter <= 'Z') { // if(letter >= 65 && letter <= 90) {
                System.out.println(letter + " is a uppercase letter");
            } else if (letter >= 'a' && letter <= 'z') { //} else if(letter >= 97 && letter <= 122){
                System.out.println(letter + " is a lowercase letter");
            } else {
                System.out.println(letter + " is not a valid letter");
            }
// todo please reviw this becaues is going to be use alot in automation.
        }

    }
}