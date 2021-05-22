package day10_shorthand_Operators;

public class ChangeBalance {
    public static void main(String[] args) {
        double balance = 1230.55;
        System.out.println("balance = " + balance);

        double bakLava = 22.50;
        System.out.println("bakLava = " + bakLava);
        // decrease balance by baklava price
        balance = balance - bakLava;
        System.out.println("Balance after bakLava = " + balance);

        double kenafa = 44.45;
        System.out.println("kenafa = " + kenafa);
        balance = balance - kenafa;
        System.out.println(" balance after kenafa = " + balance);

        //second kenafe is 50% off. lets bu it
        kenafa = kenafa / 2;
        System.out.println("kenafa = " + kenafa);
        // but it and decrease balance with kenafe price
        balance = balance - kenafa;
        System.out.println("balance after second kenafa = " + balance);

        double plov = 7.99;
        System.out.println("plov = " + plov);
        balance = balance - plov;
        System.out.println("Balance after plov = " + balance);

        double icedTea = 3.0;
        System.out.println("icedtea = " + icedTea);
        // buy 4 iced teas and decrease balance
        balance = balance - icedTea * 4;
        System.out.println("balance after 4 Iced tea  = " + balance);
        //return baklva
        System.out.println("returning baklava " + bakLava);
        balance = balance + bakLava;
        System.out.println("balance after returning baklava =$ " + balance);


    }
}
