package day10_shorthand_Operators;
import java.util.Scanner;
public class NextLineBug {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter rent: ");
        double rent = scan.nextDouble();
//        scan.nextLine();// fix the bug. Workaround add a empty scan.nextline();
        String  month = scan.nextLine();
        System.out.println("rent = " + rent);
        System.out.println("month = " + month);

    }
}