package day24_Loops;
/*
int count = 5;

count = 5
count = 4
count = 3
count = 2
count = 1
count = 0

Finished the count
﻿
 */
public class WhileLoopsReverse {
    public static void main(String[] args) {
        int count = 5;
        while (count >= 0) {
            System.out.println("counter = " +count);
            count--;
        }
        System.out.println("Finish the count");
/**
 * Reead each messge 1 by 1 until you have 0 unread sms
 *
 */
        int unreadSMS = 10;

        System.out.println("I have total " + unreadSMS +" \uD83D\uDC8C unread sms");
        while (unreadSMS >0){
            System.out.println("Reading sms ; "+ unreadSMS );
            --unreadSMS;
        }
        System.out.println("read all the SMS messages");
    }
}