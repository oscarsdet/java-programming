package day08_casting_scanner;

public class ShoppingBalanceCalculation {
    public static void main(String[] args) {
        double balance = 345.55;
        double price1 = 20.88;
        double price2 = 89.99;
        double price3 = 15;




        double remainingBalance = balance - price1 - price2 - price3;
//        double remainingBalance = balance - (price1 + price2 + price3);
        balance = remainingBalance;
        System.out.println("Your initial Balance : $ " + balance);
        System.out.println("Your remaining balance : $ " + remainingBalance);
//        System.out.println =(int) "Your remaining balance is : $ " +remainingBalance);
        int balanceWithNoCents = (int)remainingBalance;
        System.out.println("your remaining balance witout cents: $ " + balanceWithNoCents);
        /*
        Casting continued  <Convert one primitive type into another>
        byte , short  int m long
        float, double
        car
        boolean
        When we assing one primite data into different one, we need to convert  it;cast itl
        2) types of Casting
        -> Implicit Casting ---> casting happens automatically when we assign small data type into large one
        -> Explicit Casting ---> we need to use parenthesis and specify what primitive type we want to cast/convert

        Implicit Casting example :
        byte, short, int , long
        byte num1 =10;
        short num2 = num1;
        In above example we dont need parenthesis and cast it; because it is automatically happens, form small data type to larger.

        short numb3 = 3456;
        int num4 = num3;
        short -> int,  no  need o cas , it happens automatically Implicit.
        int num5 = 3453465;
        long num6 = num5;

         */









    }
}
