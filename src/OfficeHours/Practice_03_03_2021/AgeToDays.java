package OfficeHours.Practice_03_03_2021;

        /*
         - Declare two int variables: age and age in days

    - Use a base of 365 days in a year

    - Calculate and display:
        You are $age years old! That means you are $days days old

         */
public class AgeToDays {
            public static void main(String[] args) {
                int age = 20;
                int ageInDays = 365 * age;
                System.out.println("You Are " + age + "Years old! " +
                        "That measn you are " + ageInDays + " days old ");

            }
}

