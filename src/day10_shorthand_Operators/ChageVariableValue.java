package day10_shorthand_Operators;

public class ChageVariableValue {
    public static void main(String[] args) {
        int count = 3;
        System.out.println("count = " + count);
//        add/increase count by 2
        count = count =  + 2;
        System.out.println("count = " + count);
        int apple = 5;
        System.out.println("apple = " + apple);
        apple = apple + 10;
        System.out.println("apple = " + apple);
        System.out.println("apple = " + apple);
        apple = apple - 3;
        System.out.println("apple = " + apple);

        int pizzaSliices = 8;
        System.out.println("pizzaSliices = " + pizzaSliices);
        pizzaSliices = pizzaSliices / 2;
        System.out.println("pizzaSliices = " + pizzaSliices);
        /*
        get anotehr wole small pizza just for you - 6 slices
         */
        pizzaSliices = pizzaSliices + 6;
        System.out.println("pizzaSliices = " + pizzaSliices);

        int players = 10;
        System.out.println("players = " + players);
        // double the players to start the match
        players = players * 2;
        System.out.println("players = " + players);

        int cents = 568;
        System.out.println("cents = " + cents);
        //keep whole dollars portion and just assign remaining cents
        cents = cents % 100;
        System.out.println("Remaining cents = " + cents);

    }

    }
