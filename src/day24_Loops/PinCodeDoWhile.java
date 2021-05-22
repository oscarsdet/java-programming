package day24_Loops;
import java.util.Scanner;
public class PinCodeDoWhile {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        int secretPincode = 1234;
       int pinCode;// declare here so that visible for  while condition
        do {
            System.out.println("Please enter Pin Code");
            pinCode = input.nextInt();
        } while(pinCode != secretPincode);
        System.out.println("Welcom to your account ");

    }
}
