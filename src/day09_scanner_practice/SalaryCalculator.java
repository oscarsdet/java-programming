package day09_scanner_practice;

public class SalaryCalculator {
    public static void main(String[] args) {
        //EXAMPLE WITHOUT SCANNER.
        System.out.println("Enter hourly rate: ");
        double hourlyRate = 50.0;
        double weeklyPay = hourlyRate * 40;
        double monthlyPay = weeklyPay * 52 / 12;//weeklyPay *4; <--- might not be accurate.
        double annuallyPay = monthlyPay * 12;

        System.out.println("Weekly Pay: " +weeklyPay);
        System.out.println("Monthly Pay: " + monthlyPay);
        System.out.println("Weekly Pay: " + annuallyPay);






    }
}
