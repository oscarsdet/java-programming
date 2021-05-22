package day09_scanner_practice;
import java.util.Scanner;
public class GroceryShopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("WELCOME TO COSTO.");
        System.out.println("Enter Price of Milk: ");

        double price1 = scan.nextDouble();
        System.out.println("Enter Price for Bread: ");

        double price2 = scan.nextDouble();
        System.out.println("Enter Price of bread: ");

        System.out.println("enter price of cucumbers: ");
        double price3 = scan.nextDouble();

        double total = price1 + price2 + price3;
        System.out.println("total price is: $" + total );

    }
}
