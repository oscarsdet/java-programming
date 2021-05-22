package day12_conditional_statements;

import java.util.Scanner;

public class AmazonFreeShipping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your order total price : ");
        double totalPrice = scan.nextDouble();

        if (totalPrice >= 25.0) {
            System.out.println("free shipping Eligible. your order total: $ " + totalPrice);

        } else {
            System.out.println("Not eligible for free shipping . your order total : $ " + totalPrice);
        }
        System.out.println("THANK YOU FOR SHOPPING AT AMAZON");


    }
}
/*
add a class AmazonFreeShipping
add main method
import scanner
create scanner object
ask "Enter total price"
assign value to totalPrice from scan.nextDouble.

if totalPrice is more than or equal to 25
    print "FREE SHIPPING ELIGIBILE. Your order total: $55"
ELSE
    print "NOT ELIGIBLE FOR FREE SHIPPING. Your order total is $10. less than minimum of $25"
﻿
 */
