package day17_ternary_nested_conditions;

//public class FancyTeslacode {
//    public static void main(String[] args) {
//        //Scanner scan = new Scanner(System.in);
//        System.out.println();
//        System.out.println("                \"WELCOME TO TESLA COMPANY\"                  ");
//        System.out.println();
//        System.out.println("==============================================================");
//        System.out.println("| ********    ********    ********    *             ****     |");
//        System.out.println("|    **                   *           *            *    *    |");
//        System.out.println("|    **       ********    ********    *           ********   |");
//        System.out.println("|    **                          *    *           *      *   |");
//        System.out.println("|    **       ********    ********    ********    *      *   |");
//        System.out.println("==============================================================");
//        System.out.println();
//        System.out.println("pleas choose your favorite model");
//        System.out.println("   Model 'S'   ||   Model 'X'   ");
//        System.out.println();
//        System.out.print("Model: ");
//
//        char model = scan.next().charAt(0);
//        System.out.println();
//
//        double PurchasePrice = 0;
//        double trimPrice = 0;
//        double paintPrice = 0;
//        double wheelsPrice = 0;
//        double interiorPrice = 0;
//        double AutopilotPrice = 0;
//        double gasSaving = 5500;
//        double potentialSaving = 550;
//        double seatsPrice = 0;
//        String carTrim = null;
//        String carPaint = null;
//        String carWheels = null;
//        String carInterior = null;
//        String carSeats = null;
//        String FullSelfDriving = "Full Self-Driving";
//
//
//        if (model == 'S') {
//            System.out.println("Which trim do you like: ");
//            System.out.println("1.Long Range     2.Plaid      3.Plaid+ ");
//            System.out.print("Trim: ");
//            int trim = scan.nextInt();
//            System.out.println();
//            switch (trim) {
//                case 1:
//                    carTrim = "Model S Long Range";
//                    System.out.println("Thanks for choosing " + carTrim);
//                    System.out.println("   375mi         3.1s        155mph      1,020hp  ");
//                    System.out.println(" Range(est.)   0-60 mph*    Top Speed    Peak Power ");
//                    System.out.println();
//                    trimPrice = 79_990;
//
//                    break;
//                case 2:
//                    carTrim = "Model S Plaid";
//                    System.out.println("Thanks for choosing " + carTrim);
//                    System.out.println("   350mi         1.99s        200mph      1,020hp  ");
//                    System.out.println(" Range(est.)   0-60 mph*    Top Speed    Peak Power ");
//                    System.out.println();
//                    trimPrice = 119_990;
//
//                    break;
//                case 3:
//                    carTrim = "Model S Plaid+";
//                    System.out.println("Thanks for choosing " + carTrim);
//                    System.out.println("   520+mi       <1.99s        200mph      1,020hp  ");
//                    System.out.println(" Range(est.)   0-60 mph*    Top Speed    Peak Power ");
//                    System.out.println();
//                    trimPrice = 149_490;
//            }
//            System.out.println();
//            System.out.println("--------------------------------------------------------");
//            System.out.println("What color do you want");
//            System.out.println("Paint Options: White (included) - Black, Silver, Blue($1,500) - Red($2,500)");
//            System.out.println();
//            System.out.print("Paint: ");
//            String paint = scan.next();
//
//            switch (paint) {
//                case "white":
//                    PurchasePrice = PurchasePrice;
//                    carPaint = "Pearl White Multi-Coat";
//                    System.out.println("paint = " + carPaint);
//                    break;
//                case "Black":
//                    paintPrice += 1500;
//                    carPaint = "Solid Black";
//                    System.out.println("paint = " + carPaint);
//                    break;
//                case "Silver":
//                    paintPrice += 1500;
//                    carPaint = "Midnight Silver Metallic";
//                    System.out.println("paint = " + carPaint);
//                    break;
//                case "Blue":
//                    paintPrice += 1500;
//                    carPaint = "Deep Blue Metallic";
//                    System.out.println("paint = " + carPaint);
//                    break;
//                case "Red":
//                    paintPrice += 2500;
//                    carPaint = "Red Multi-Coat";
//                    System.out.println("paint = " + carPaint);
//                    break;
//                default:
//                    System.out.println("Sorry We dont have this color");
//            }
//            System.out.println("--------------------------------------------------------");
//            System.out.println("Choose thw Wheels: ");
//            System.out.println("1. 19\" Tempest Wheels (included) ");
//            System.out.println("2. 21\" Arachnid Wheels ($4,500) ");
//            System.out.println();
//            System.out.print("Wheels: ");
//            int wheels = scan.nextInt();
//            if (wheels == 2) {
//                wheelsPrice += 4500;
//                carWheels = "21\" Arachnid Wheels";
//            }
//            if (wheels == 1) {
//                carWheels = "9\" Tempest Wheels";
//            }
//            System.out.println();
//            System.out.println("--------------------------------------------------------");
//            System.out.println("Choose Interior: ");
//            System.out.println("1. All Black (included) ");
//            System.out.println("2. Black and White ($2,000)");
//            System.out.println("3. Cream ($2,000)");
//            System.out.println();
//            System.out.print("Interior: ");
//            int interior = scan.nextInt();
//            switch (interior) {
//                case 1:
//                    carInterior = "All Black Premium Interior";
//                    interiorPrice = 0;
//                    break;
//                case 2:
//                    carInterior = "Black and White Premium Interior";
//                    interiorPrice += 2000;
//                    break;
//                case 3:
//                    carInterior = "Cream Premium Interior";
//                    interiorPrice += 2000;
//                    break;
//            }
//            System.out.println();
//            System.out.println("--------------------------------------------------------");
//            System.out.println("Full Self-Driving Capability");
//            System.out.println("* on Autopilot");
//            System.out.println("* Lane Change");
//            System.out.println("* Summon");
//            System.out.println("* Full Self-Driving Computer");
//            System.out.println("* Traffic Light and Stop Sign Control");
//            System.out.println();
//            System.out.println("Price: $10,000");
//            System.out.println();
//            System.out.print("ADD(YES / NO): ");
//            char SelfDriving = scan.next().charAt(0);
//            if (SelfDriving == 'Y') {
//                AutopilotPrice += 10000;
//            }
//
//            PurchasePrice = trimPrice + paintPrice + wheelsPrice + interiorPrice + AutopilotPrice;
//            double PriceAfterSaving = PurchasePrice - (gasSaving + potentialSaving);
//
//            System.out.println();
//            System.out.println("=========================================================");
//            System.out.println("                       Your Model " + model + "               ");
//            System.out.println("=========================================================");
//            System.out.println(carTrim + "                                   $" + trimPrice);
//            System.out.println("---------------------------------------------------------");
//            System.out.println(carPaint + "                                    $" + paintPrice);
//            System.out.println("---------------------------------------------------------");
//            System.out.println(carWheels + "                               $" + wheelsPrice);
//            System.out.println("---------------------------------------------------------");
//            System.out.println(carInterior + "                            $" + interiorPrice);
//            System.out.println("---------------------------------------------------------");
//            System.out.println("Autopilot                                        Included");
//            System.out.println("---------------------------------------------------------");
//            System.out.println(FullSelfDriving + "                                $" + AutopilotPrice);
//            System.out.println("---------------------------------------------------------");
//            System.out.println("Purchase Price                                   $" + PurchasePrice);
//            System.out.println("---------------------------------------------------------");
//            System.out.println("Est. 6-year gas savings                         - $" + gasSaving);
//            System.out.println("---------------------------------------------------------");
//            System.out.println("Potential savings                                - $" + potentialSaving);
//            System.out.println("---------------------------------------------------------");
//            System.out.println("Price after Est. Savings                         $" + PriceAfterSaving);
//
//        } else if (model == 'X') {
//            System.out.println("Which trim do you like: ");
//            System.out.println("1.Long Range     2.Plaid     ");
//            System.out.print("Trim: ");
//            int trim = scan.nextInt();
//            System.out.println();
//            switch (trim) {
//                case 1:
//                    carTrim = "Model X Long Range";
//                    System.out.println("Thanks for choosing " + carTrim);
//                    System.out.println("   350mi         3.8s        155mph      1,020hp  ");
//                    System.out.println(" Range(est.)   0-60 mph*    Top Speed    Peak Power ");
//                    System.out.println();
//                    trimPrice = 83_190;
//
//                    break;
//                case 2:
//                    carTrim = "Model X Plaid";
//                    System.out.println("Thanks for choosing " + carTrim);
//                    System.out.println("   330mi         2.5s        163mph      1,020hp  ");
//                    System.out.println(" Range(est.)   0-60 mph*    Top Speed    Peak Power ");
//                    System.out.println();
//                    trimPrice = 113_190;
//                    break;
//            }
//
//            System.out.println();
//            System.out.println("--------------------------------------------------------");
//            System.out.println("What color do you want");
//            System.out.println("Paint Options: White (included) - Black, Silver, Blue($1,500) - Red($2,500)");
//            System.out.println();
//            System.out.print("Paint: ");
//            String paint = scan.next();
//
//            switch (paint) {
//                case "white":
//                    PurchasePrice = PurchasePrice;
//                    carPaint = "Pearl White Multi-Coat";
//                    System.out.println("paint = " + carPaint);
//                    break;
//                case "Black":
//                    paintPrice += 1500;
//                    carPaint = "Solid Black";
//                    System.out.println("paint = " + carPaint);
//                    break;
//                case "Silver":
//                    paintPrice += 1500;
//                    carPaint = "Midnight Silver Metallic";
//                    System.out.println("paint = " + carPaint);
//                    break;
//                case "Blue":
//                    paintPrice += 1500;
//                    carPaint = "Deep Blue Metallic";
//                    System.out.println("paint = " + carPaint);
//                    break;
//                case "Red":
//                    paintPrice += 2500;
//                    carPaint = "Red Multi-Coat";
//                    System.out.println("paint = " + carPaint);
//                    break;
//                default:
//                    System.out.println("Sorry We dont have this color");
//            }
//            System.out.println("--------------------------------------------------------");
//            System.out.println("Choose thw Wheels: ");
//            System.out.println("1. 19\" Tempest Wheels (included) ");
//            System.out.println("2. 21\" Arachnid Wheels ($4,500) ");
//            System.out.println();
//            System.out.print("Wheels: ");
//            int wheels = scan.nextInt();
//            if (wheels == 2) {
//                wheelsPrice += 5500;
//                carWheels = "222'' Turbine Wheels";
//            }
//            if (wheels == 1) {
//                carWheels = "20'' Cyberstream Wheels";
//            }
//            System.out.println();
//            System.out.println("--------------------------------------------------------");
//            System.out.println("Choose Interior: ");
//            System.out.println("1. All Black (included) ");
//            System.out.println("2. Black and White ($2,000)");
//            System.out.println("3. Cream ($2,000)");
//            System.out.println();
//            System.out.print("Interior: ");
//            int interior = scan.nextInt();
//            switch (interior) {
//                case 1:
//                    carInterior = "All Black Premium Interior";
//                    interiorPrice = 0;
//                    break;
//                case 2:
//                    carInterior = "Black and White Premium Interior";
//                    interiorPrice += 2000;
//                    break;
//                case 3:
//                    carInterior = "Cream Premium Interior";
//                    interiorPrice += 2000;
//                    break;
//            }
//            System.out.println();
//            System.out.println("--------------------------------------------------------");
//            System.out.println("choose the Seating Layout");
//            System.out.println("5. Five Seats     6. Six Seats     7. Seven Seats");
//            System.out.println();
//            System.out.print("Seats : ");
//            int seats = scan.nextInt();
//            System.out.println();
//            switch (seats) {
//                case 5:
//                    carSeats = "Five Seats Interior";
//                    break;
//                case 6:
//                    carSeats = "Six Seats Interior";
//                    seatsPrice += 6500;
//                    break;
//                case 7:
//                    carSeats = "Seven Seats Interior";
//                    seatsPrice += 3500;
//                    break;
//                default:
//                    System.out.println("Yoy can choose only 5, 6, and 7 seats");
//            }
//            System.out.println();
//            System.out.println("--------------------------------------------------------");
//            System.out.println("Full Self-Driving Capability");
//            System.out.println("* on Autopilot");
//            System.out.println("* Lane Change");
//            System.out.println("* Summon");
//            System.out.println("* Full Self-Driving Computer");
//            System.out.println("* Traffic Light and Stop Sign Control");
//            System.out.println();
//            System.out.println("Price: $10,000");
//            System.out.println();
//            System.out.print("ADD(YES / NO): ");
//            char SelfDriving = scan.next().charAt(0);
//            if (SelfDriving == 'Y') {
//                AutopilotPrice += 10000;
//
//                PurchasePrice = trimPrice + paintPrice + wheelsPrice + interiorPrice + seatsPrice + AutopilotPrice;
//                double PriceAfterSaving = PurchasePrice - (gasSaving + potentialSaving);
//
//                System.out.println();
//                System.out.println("=========================================================");
//                System.out.println("                       Your Model " + model + "               ");
//                System.out.println("=========================================================");
//                System.out.println(carTrim + "                               $" + trimPrice);
//                System.out.println("---------------------------------------------------------");
//                System.out.println(carPaint + "                                    $" + paintPrice);
//                System.out.println("---------------------------------------------------------");
//                System.out.println(carWheels + "                               $" + wheelsPrice);
//                System.out.println("---------------------------------------------------------");
//                System.out.println(carInterior + "                            $" + interiorPrice);
//                System.out.println("---------------------------------------------------------");
//                System.out.println(carSeats + "                               $" + seatsPrice);
//                System.out.println("---------------------------------------------------------");
//                System.out.println("Autopilot                                        Included");
//                System.out.println("---------------------------------------------------------");
//                System.out.println(FullSelfDriving + "                                $" + AutopilotPrice);
//                System.out.println("---------------------------------------------------------");
//                System.out.println("Purchase Price                                   $" + PurchasePrice);
//                System.out.println("---------------------------------------------------------");
//                System.out.println("Est. 6-year gas savings                         - $" + gasSaving);
//                System.out.println("---------------------------------------------------------");
//                System.out.println("Potential savings                                - $" + potentialSaving);
//                System.out.println("---------------------------------------------------------");
//                System.out.println("Price after Est. Savings                         $" + PriceAfterSaving);
//            }
//
//
//        }
//
//
//    }
//}
//
