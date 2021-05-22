package OfficeHours.Practice_03_02_2021;

import javax.swing.plaf.basic.BasicSplitPaneUI;

public class Apartment {
    public static void main(String[] args) {
        /*
        create a class named Apartment
create a main method

    Create the variables with the most appropriate datatype:

        - address, name of owner, number of units, average size of each unit, monthly rent amount,
         number of washers and driers, allows pets or not, has a pool, length of lease,
         total number of residents in building, phone number of owner, is near a gas station, number of floors,
         has a basement, has available units for rent, has air conditioning, number of parking spaces,
          has wheel chair access, number of review stars (out of 5)

        - Create these variables and use previous variables to get the values

            - monthly rent after 3 years (discount 10% off original rent)
            - monthly rent after 6 years (discount 20% off original rent)
            - Average number of residents per unit (total residents / number of units)
            - Average number of parking spots per unit ( parking spots / units)
            - Average number of units per floor ( units / number of floors)
         */

          System.out.println("==========STUARTWOOD APARTMENTS===========");
        String address = "140-A Laurel Way Herndon, VA 20170 ";
                String ownerFirstName  = "John ";
                String ownerLastName = "Smith ";
                 Short numberOfUnits =  350;
                 String averageSize = "943 sq.ft. ";
                 double monthlyRent = 1450.00;
                 byte numberOfWashers = 1;
                 byte numberOfDryers = 1;
                 String petsAllowsOrNot = "Yes ";
                 boolean hasAPool = true;
                 byte   lengthOfLease   = 12;
                 Short totalNumberOfResidentsInBuilding = 1236;
                 String phoneNumberOfOwner = "866-833-8374";
                 boolean isNearAgasStation = false;
                 byte numberOfFloors = 3;
                 boolean hasABasement = false;
                 boolean hasAvailbleUnitsForRent = true;
                 boolean hasAirConditioning = true;
                 double numberOfParkingSpaces = 600;
                 boolean hasWheelChairAces = true;
                 byte numberOfReviewStar = 5;

        System.out.println("address  " + address);
        System.out.println("Owner Full Name:  " + ownerFirstName +""+ ownerLastName );
        System.out.println("Owner Phone Number: " + phoneNumberOfOwner);
        System.out.println("Monthly Rent: " + monthlyRent + " on " + averageSize + " Apartment.");
        System.out.println("Number of Washers: " + numberOfWashers );
        System.out.println("Number of  Dryers: " + numberOfDryers);
        System.out.println("Number of Units: " + numberOfUnits);
        System.out.println("The Building has, " + numberOfFloors + " Floors");
        System.out.println("There is: " + totalNumberOfResidentsInBuilding+ " Residents Living in the Building.");
        System.out.println("Pets Allow? " + petsAllowsOrNot);
        System.out.println("Has Pool?  " + hasAPool);
        System.out.println("Does have a Basement? " + hasABasement);
        System.out.println("the Apartment has Air Condiotioning:  " + hasAirConditioning);
        System.out.println("the Apartments has Wheelchair Access:  " + hasWheelChairAces);
        System.out.println("We offer " + numberOfParkingSpaces + " Parking Spaces");
        System.out.println("Are the Apartment near a Gas Station? " + isNearAgasStation);

        System.out.println("Is there any available apartment " + hasAvailbleUnitsForRent);
        System.out.println("How long is the lease? " + lengthOfLease + " onths. ");
        System.out.println("Number of reviews " + numberOfReviewStar);

        double rentAfter3Years = monthlyRent * 0.01 * 90;
        double rentAfter6Years = monthlyRent *0.01 * 80;
        int averageNumberOfResisdentsPerUniit = totalNumberOfResidentsInBuilding / numberOfUnits;
        int AverageParkingSpotsPerUnit = (int) (numberOfParkingSpaces / numberOfUnits);
        int averageUnitsPerFloor = numberOfUnits / numberOfFloors;

        System.out.println("******************************************************");
        System.out.println("Rent After 3 Years: " + rentAfter3Years);
        System.out.println("Rent after 6 Years " + rentAfter6Years);
        System.out.println("Average Number of Residents Per Union: " + averageNumberOfResisdentsPerUniit);
        System.out.println("Average parking Spots per Unit: " + AverageParkingSpotsPerUnit);
        System.out.println("Average Units Per Floor: " + averageUnitsPerFloor);
        System.out.println("*******************************************************");





    }
}
