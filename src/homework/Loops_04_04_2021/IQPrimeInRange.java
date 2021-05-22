package homework.Loops_04_04_2021;
import java.util.Scanner;
/*
[IQ] Prime in range
Given a number. Print out all the prime numbers from 2 to that number
A prime number is a number that is only divisible by 1 and itself.
Ex:
Input: 50
Output:
2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47
 */
public class IQPrimeInRange {
    public static void main(String[] args) {
        int n = 50;
        for (int i = 2; i <= n; i++){
            if (i % 2 != 2 && i %3 !=0 && i % 7 != 0 || i == 2 || i ==3 || i == 5 ){
                System.out.println(i + ",");
            }
        }

    }
}