package day28_03_31_2021;

/**
 * int totalCases = 0;
 * loop day = 1 till day 30
 *
 * every day there are 200 new cases
 *
 * every sunday(day % 7 == 0) there are 500 new cases
 *
 * "day 1 - daily cases: 200"
 *
 * --------------
 *
 * print totalCases =
 */
public class JavaCityCases {
    public static void main(String[] args) {
        int totalCases = 0;

        for (int day = 1; day <= 30; day++) {
            if (day % 7 == 0) { //sundays more cases
                totalCases += 500;
            } else {
                totalCases += 200;
            }
            System.out.println("Day " + day + " | total cases : " + totalCases);
        }

        System.out.println("JavaCity 03/2021 Total Cases: " + totalCases);

    }
}