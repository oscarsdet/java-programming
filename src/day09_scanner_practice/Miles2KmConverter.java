package day09_scanner_practice;
import java.util.Scanner;
public class Miles2KmConverter {
    public static void main(String[] args) {
  /*
    import scanner
create scanner object
miles, kilometers

Enter miles:
10
10 miles in kilometer: 16.0934

---------
formula:
kilometers -> miles * 1.609
     */
        Scanner scan = new Scanner(System.in);
        System.out.println("#######Miles Convert to Kilometers#########");
        System.out.println("Enter Milies ");
//        double miles = 10.0;
        double miles = scan.nextDouble();// input data and it will scan it
        double kilometers = miles * 1.609;
        System.out.println(miles + " in kilometer");
        System.out.println(miles + " miles  in kilometers: " + kilometers);
    }
}