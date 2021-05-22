package day40b_ReviewClass;
/*
[sum of numbers from String]
Crate a method that will accept a String and returns the sum of all the numbers in he String.

Requirement: any numbers that are nest to each other are not single digit numbers but instead rad as full number
ex: a5bc12def100g
Here we would have added 5+12+100
NOT: 5+1+2+1+0+0

 */
public class SumOfNumbers {
    public static void main(String[] args) {
        System.out.println(getSumFromString("a5bc12def100g"));


    }

    public static int getSumFromString(String str) {

        int sum = 0;
        String num = "";// 12

        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))) {//checks if every character is a number(digit)
                //action
                num += str.charAt(i);

                if (i== str.length()-1 || !Character.isDigit(str.charAt(i + 1))) {
                    sum += Integer.parseInt(num);
                    num = ""; // resets our String for next the number
                }
            }
        }
        return sum;
    }
}