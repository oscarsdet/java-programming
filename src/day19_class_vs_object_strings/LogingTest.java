package day19_class_vs_object_strings;

import java.time.Instant;

/**
 * expUserName = "cybertek"
 * expPassword = "Abc123"
 *
 * userName = "CYBERTEK"
 * password = "Abc123"
 *
 * userName is not case sensitive
 * password is case sensitive
 *
 * WHEN expUserName equals userName AND expPassword equals password
 *     -> "Pass - user successfully logged in"
 *
 * OTHERWISE:
 *     WHEN expUserName NOT equals userName
 *         -> "Incorrect Username"
 *     OTHERWISE:
 *         -> "Incorrect password"
 */
public class LogingTest {
    public static void main(String[] args) {
        String expUserName = "cybertek";
        String expPassword = "Abc123";

        String userName = "Cybertek";
        String password = "abc123";

        if (expUserName.equalsIgnoreCase(userName) && expPassword.equals(password)) {
            System.out.println("Pass - user logged in successfully ");
        }else {
            System.out.println("Fail - login  failed");

            //NESTED
//            if(!expUserName.equalsIgnoreCase(userName)) {
//                System.out.println("Fail - username is incorrect");
//            }else{
//                System.out.println("Fail - password is incorrect");

                }//todo DO THREE DIFFERENT EXCERSE TO LEARN MORE NO LATER THAN THREE DAY 03/24/2021 DUE DATE
            }
        }

