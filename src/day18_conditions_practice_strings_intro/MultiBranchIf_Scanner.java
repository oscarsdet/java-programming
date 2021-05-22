package day18_conditions_practice_strings_intro;
import java.util.Scanner;
public class MultiBranchIf_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number");

        int num = scan.nextInt();
        if (num > 5){
            System.out.println(+num + " number is:");
        }else if (num<0){
            System.out.println(num + " negative is");
        }else {
            System.out.println(num + " number is ");
            }
        }
    }

