package day13_Conditional_Statements;

/*
add new class ATMPincodeProgram
main method
print "**** WELCOME TO TD BANK ATM ****"
secretPincode => ****
inputPincode => ****

if condition checks if secretPincode equals inputPincode
    true:
        "Welcome to your account."
        "You can withdraw, check balance, deposit"
    false:
        "Incorrect pincode! 1234"
        "Please try again."


print "Thank you for using TD Bank ATM!"
 */
public class ATMincodePragram {
    public static void main(String[] args) {
        System.out.println("*******WELCOME TO TD BANK*******");
        int secretePincode = 2233;
        int inputPincode = 2233;

        if (secretePincode == inputPincode) {
            System.out.println("welcome to your account");
            System.out.println("you can withdraw, check your balance, deposit");
        } else {
            System.out.println("incorrect pincode! input " + inputPincode);
            System.out.println("Please try again!");
        }
        System.out.println(" thank you for using TD Bank ATM!");

    }

}
