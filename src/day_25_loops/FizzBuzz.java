package day_25_loops;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
           if (i % 3 == 0 && i % 5 == 0 ){
               System.out.println("FizzBuzz");
           }else if(i % 3 == 0){
               System.out.println("Fizz");
           }else if (i % 5 == 0){
               System.out.println("buzz");
           }else {
               System.out.println(i);
           }
        }

        }
    }
/*
loop from 1 to 100
    when num divisable by 3 and 5
        -> "FizzBuzz"
    when num divisable by 3
        -> "Fizz"
    when num divisable by 5
        -> "Buzz"
    else
        -> print num
 */