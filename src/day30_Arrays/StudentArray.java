package day30_Arrays;

import java.util.Locale;

/*
add new class StudentArray

id        - 0
firstName - 1
lastName  - 2
batchNum  - 3
phoneNum  - 4

Declare student array and store 5 String values

String[] student1 = {"1234", "Adam"...};

String[] student2 = new String[5];
-----------------------------
 */
public class StudentArray {
    public static void main(String[] args) {
      String[] student1 = new String [5];
      student1[0] = "AD1234";
      student1[1] = "Adam";
      student1[2] = "Smith";
      student1[3] = "B22";
      student1[4] = "202-543-1234";

      String[] student2 = {"MK4421", "Mike", "Bloomberg", "B22", "703-432-1234"};// this way is good when you know data.

        System.out.println("student1 id = " + student1[0]);
        System.out.println("student1 first name = " + student1[1]);
        System.out.println("student1 last name = " + student1[2]);
        System.out.println("student1 bacth number = " + student1[3]);
        System.out.println("student1 phone number = " + student1[4]);


          /* check if student1 data array contains 5 items.
         true: Pass data array has correct length
        false: Fail data array has incorrect length
         */

        if (student1.length == 5) {
            System.out.println("Pass data array has correct length");

        }else {
            System.out.println("Fail data array length miss match");
        }
        /**
         * read from array and print firstname and lastname in all uppercase
         * ADAM Smith
         */


        System.out.println("Student data length : " + student1.length);
        //                  "Adam"         -->> "ADAm"       "Smith"  ---> "SMITH
        System.out.println(student1[1].toUpperCase(Locale.ROOT) + " | " + student1[2].toUpperCase(Locale.ROOT));
        System.out.println((student1[1].toUpperCase(Locale.ROOT) + " "+ student1[2].toUpperCase(Locale.ROOT)));// 2nd option

        // read mobile from array and store into variable
        String mobileNum = student1[4];
        System.out.println("phone Number= " + mobileNum);
        System.out.println(mobileNum.length());
        System.out.println(mobileNum.startsWith("202"));

        int[] nums = {22, 55, 11};
        for (int i = 0; i < nums.length; i++)
        System.out.println(nums[i]);




    }
}
