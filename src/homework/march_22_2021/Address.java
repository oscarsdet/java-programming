package homework.march_22_2021;
import java.util.Locale;
/**
 *  A person will enter their address into a String. Make sure the String is not empty.
 *     If it is empty print: "No address found".
 *     If there is an address make all the text uppercase to match the expected format
 *
 *         Ex:
 *             Input: 231332 leaf ave, lake city .
 *             Output: 231332 LEAD AVE, LAKE CITY 3132
 *
 *         Ex:
 *             Input: ""
 *             Output: No address found
 */
public class Address {
    public static void main(String[] args) {
        String address = "231332 leaf, lake ciy 3132";
        String noAddress = "";
        address = address.toUpperCase();
    if (address.contains("231332 leaf ave, laek city 3132"));
        address.toUpperCase();
        System.out.println(address);
        address.equals("");
        System.out.println("No address found");

    }
    }
