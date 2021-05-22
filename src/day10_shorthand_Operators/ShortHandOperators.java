package day10_shorthand_Operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        int cars = 10;
        System.out.println("cars in Parking lot  = " + cars);
        cars = cars + 2;
        System.out.println("cars in parking lot  = " + cars);
        cars += 5;
        System.out.println("cars in parking lot = " + cars);

        // 6 cars left the parking lot
        // cars = cars -=6;
        cars -= 6;
        System.out.println("cars in parking lot = " + cars);

        cars = cars -1;
        cars -=1;
        System.out.println("cars in parking lot= " + cars);

        int electricCars = 13;
//        cars = cars + electricCars;
        cars += electricCars;
        System.out.println("cars in parking lot= " + cars);

        String word = "java";
        System.out.println("world = " + word);

        word = word + " Programming ";
        System.out.println("world = " + word);
        //add " is fun "
        word +="is fun";
        System.out.println("world = " + word);

        String selenium = "but \"selenium \" is more fun. ";
        word += 12345;// add 12345 to word
        System.out.println("selenium = " + selenium);

        char letter = 'A';
        System.out.println("letter = " + letter);
        letter += 3;
        System.out.println("letter = " + letter);
        // add 'j' to letter
        letter += 'J';
        System.out.println("letter = " + letter);

        double parkingFree = 7.50;
        System.out.println("Normal parking Fee = " + parkingFree);
        // early bird fee is 50% ff
        // parkingFee /=2;
        parkingFree /= 2;
        System.out.println("early birg parking Fee = " + parkingFree);
        // weeekend parking is free
        parkingFree -= parkingFree;//parkingfee = parkinFee - parkingFee;
        System.out.println("weekend parking fee  = " + parkingFree);


    }
}
