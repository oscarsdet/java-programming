package day09_scanner_practice;
import java.util.Scanner;
public class AskAgeV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you");
        int age = scan.nextInt();// int age  = 11
        System.out.println(age + "-that's great ega!");

        //scan.close(); optionally close the scanner

        /*
        03/06/2021
----------

Java Programming Day 9
----------------------

Casting
Scanner class, how to use it.

new Package day09_scanner_practice
new class AskAgeV1
main method

Flow:
    print "How old are you?"
    age -> 22
    print "22 - thats great age!"
----------------------------------
new class AskAgeV2
main method

print "How old are you?"
age -> System input scan.nextInt();
print "age - thats great age!"

import day09_scanner_practice.AskAgeV1;
1) IMPORT SCANNER:

import java.util.Scanner;
java.util -> is a package name where Scanner class is located.

import means, "I would like to use this class in my program, so import it."

2) Create Scanner object

Scanner scan = new Scanner(System.in);

Scanner scan -> declare a variable of data type Scanner
String name;
int age;
Scanner is non-primitive , object type, class type.
Scanner is class name

new -> create new object from a class

3) use scanner function/method to accept int from keyboard

nextInt -> accept int value (whole number) from keyboard/console

---------------------

So we have been assigning values into variables in our java programs, like int n = 33;

Scanner can be used to enter different values when programming is running. We enter values to our variables from keyboard, then that value will go into our variable

int n = 33; -> value 33 is already assigned to n variable

int n = scan.nextInt(); -> value will be assigned from console/keyboard when program is running

EX:
Enter number:
44

44 will be assigned into n variable now.

HARDCODING the value: assigning the value to a variable in your CODE.
Not from scanner or any other source.
----------------------

Scanner class gives us a capability to pass values/inputs into our java programs. interactive way.

BREAK TILL 11:13 AM EST
         */



    }
}



