package day09_scanner_practice;
import java.util.Scanner;
public class SalaryCalculatorV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter hourly Rate:");
        double hourlyRate = scan.nextDouble();
        double weeklyPay = hourlyRate * 55;
        double monthlyPay = weeklyPay * 52 / 12;//weeklyPay *4; <--- might not be accurate.
        double annuallyPay = monthlyPay * 12;

        System.out.println("Weekly Pay: " +weeklyPay);
        System.out.println("Monthly Pay: " + monthlyPay);
        System.out.println("Weekly Pay: " + annuallyPay);

    }
}
