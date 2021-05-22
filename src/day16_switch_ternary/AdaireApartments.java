package day16_switch_ternary;

/**
 * #### WELCOME TO ADAIRE APARTMENTS ####
 *
 * numberOfBedrooms = 0, 1, 2
 *
 * startingPrice = 0;
 *
 * when numberOfBedrooms 0:
 *     print: "Studio apartment selected"
 *     startingPrice -> 1454
 *
 * when numberOfBedrooms 1:
 *     print: "One bedroom apartment selected"
 *     startingPrice -> 1725
 *
 * when numberOfBedrooms 2:
 *     print: "Two bedroom apartment selected"
 *     startingPrice -> 2899
 *
 * ------
 * "Starting price $1454"
 * ﻿
 */
public class AdaireApartments {
    public static void main(String[] args) {
int numberOfBedrooms = 2;
double startingPrice = 0;
double squareFootage = 0;
System.out.println("===WELCOME TO ADAIRE APARTMENTS===");
switch (numberOfBedrooms){
    case 0:
        System.out.println("Studio Apartment Selected ");
        startingPrice = 1454.0;
        break;
    case 1:
        System.out.println("you selecte on bedroom apartment");
        startingPrice = 1725;
        break;
    case 2:
        System.out.println("You selected two bedroom apartment ");
        startingPrice =  2899;
        break;
    default:
        System.out.println(numberOfBedrooms + " bedroom currently unavailable");
        // return; exit Main method


}
System.out.println("Starting Price $ " + startingPrice);
    }
}
