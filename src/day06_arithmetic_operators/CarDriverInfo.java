package day06_arithmetic_operators;

public class CarDriverInfo {
    public static void main(String[] args){
        String carModel = "Nissan Pathfinder";
        String driverName = "Donald Trump";
        String licenseNum = "nhl4567";
        Short speed = 55;
        boolean isAutomatic = true;
        char licenseClass = 'D';

        System.out.println("Car model is: " +carModel);
        System.out.println("Driver Name: " + driverName);
        System.out.println("License Number: " + licenseNum);
        System.out.println("Speed: " + speed);
        System.out.println("Is Automatic? " + isAutomatic);
        System.out.println("License Class: " + licenseClass);

//        System.out.println(carModel + "is car model.")


//        System.out.println("Car model is:\t\t\t " +carModel);
//        System.out.println("Driver Name: \t\t\t " + driverName);
//        System.out.println("License Number:\t\t\t " + licenseNum);
//        System.out.println("Speed:\t\t\t\t\t\t " + speed);
//        System.out.println("Is Automatic?\t\t\t\t " + isAutomatic);
//        System.out.println("License Class:\t\t\t\t\t" + licenseClass);

        System.out.println("Car model : "+carModel);
        System.out.println("Driver name:" + driverName);
        System.out.println(driverName +" is driving a car");
        System.out.println(driverName + " is drinving " +carModel);


        System.out.println("Current speed is " +speed);
        System.out.println("current speed is : " +speed+ " MPH");
        System.out.println(licenseClass+"is this car automatic: " + isAutomatic);
        System.out.println(licenseClass+ " - " +isAutomatic);


    }
}
