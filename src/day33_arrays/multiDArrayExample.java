package day33_arrays;

import java.util.Arrays;

/**
 * Teodora Tsvetanov
 * Anna Ziyayeva
 * Parvin Altae
 * TeodorasPWD12
 * AnnaAlmaty123
 * ParvinVienna321
 *
 *
 */
public class multiDArrayExample {
    public static void main(String[] args) {
        String[][] users = new String[3][2];
        users[0][0] = "Teodora Tsvetanov";
        users[0][1] = "TeodorasPWD12";
        users[1][0] = "Anna Ziyayeva";
        users[1][1] = "AnnaAlmaty123";
        users[2][0] = "Parvin Altae";
        users[2][1] = "ParvinVienna321";

        String[][] userData = {{"Teodora Tsvetanov", "TeodorasPWD12"},
                {"Anna Ziyayeva", "AnnaAlmaty123"},
                {"Parvin Altae", "ParvinVienna321"}};

        // System.out.println(userData[0][0].split(" ")[0]);
        System.out.println(userData[0][0]);
        System.out.println(userData[1][0]);
        System.out.println(userData[2][0]);

        System.out.println(userData[0][1]);
        System.out.println(userData[1][1]);
        System.out.println(userData[2][1]);

        System.out.println(Arrays.deepToString(userData));

    }
}