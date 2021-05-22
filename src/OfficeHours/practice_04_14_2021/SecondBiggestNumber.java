package OfficeHours.practice_04_14_2021;

public class SecondBiggestNumber {
    /*[IQ] Second Biggest Number
Given an Array of numbers. Find and print the 2nd biggest number. Note
the 2nd biggest should be unique meaning it should be different from
the max number
Example:
Input:
[4,3,1,4,5,2,4,8,4,8]
Output:
5*/
    public static void main(String[] args) {
        int [] nums = {4,3,1,4,5,2,4,8,4,8};
        int max = nums[0];//     4
        int secondMax = nums[0];//4

        for (int eachNumber : nums){
            if (eachNumber > max){
                secondMax = max;
                max = eachNumber;

            }
            if (eachNumber > secondMax && eachNumber < max){
                secondMax = eachNumber;

            }
        }
        System.out.println("max: " +max);
        System.out.println("2nd max: " + secondMax);




    }
}
