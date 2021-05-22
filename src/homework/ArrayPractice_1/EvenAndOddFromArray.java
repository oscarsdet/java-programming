package homework.ArrayPractice_1;
/*
Even and odd from arrayWrite a program that can count the even and odd number from an array of integers Use
for each to make it easier
Ex:
Input: [4,1,3,12,5]
Output:
 Even:2
 Odd: 3
 */
import java.util.Arrays;
import java.util.Scanner;
public class EvenAndOddFromArray {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 2, 8, 6, 5};
        int evenCNT = 0;
        int oddCNT = 0;

        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenCNT++;

                System.out.println(" The even number: "+ numbers[i]);
                System.out.println (evenCNT);

            } else if (numbers[i] % 2 == 1) {
                oddCNT++;
                System.out.println(" The odd number : "+ numbers[i]);
                System.out.println(oddCNT);
            }
        }
    }
}