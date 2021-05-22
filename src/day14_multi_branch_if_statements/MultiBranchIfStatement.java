package day14_multi_branch_if_statements;
import java.util.Scanner;
public class MultiBranchIfStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int day = 3;
        if (day == 1) {
            System.out.println("Monday");
        } else {
            System.out.println("Tuesday");
        }

        if (day == 2) {
            System.out.println("monday");
        } else {
            System.out.println("not monday");
        }

        if (day == 2) {
            System.out.println("Tuesday");
        }

        if (day == 2) {
            System.out.println("Wednesday");
        }
        System.out.println("=================MULTI BRANCH IF STATEMENT================");

        day = 1;
        if (day == 2) {
            System.out.println("Monday");
        } else if (day ==2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else {
            System.out.println("Java Day ");
        }
        System.out.println(" Everyday code java");

        }
    }
/*
Scanner scan = new Scanner(System.in);
        System.out.println(" Enter the day ");
        int day = scan.nextInt();
        if (day == 1) {
            System.out.println("Monday!");
        } else if ( day == 2){
            System.out.println("Tuesday");
        }else if ( day == 3){
            System.out.println("Wednesday!");
        }else if( day == 4){
            System.out.println("Thursday");
        }else if( day == 5){
            System.out.println("Friday");

        }else if( day == 6){
            System.out.println("Saturday");
        }else if( day == 7){
            System.out.println("Saturday");
        }else {
            System.out.println(" in valid day entered");
        }

    }
}
 */
