package day30_Arrays;

public class ArrayLoopWithConsditions {
    public static void main(String[] args) {
        double[] prices = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};

        String[] countries = {"Brazil",
                "China",
                "Cuba",
                "Sweden",
                "France",
                "Vietnam",
                "Albania",
                "Brazil",
                "Portugal",
                "China",
                "Philippines",
                "Philippines",
                "China",
                "Philippines",
                "China",
                "Armenia",
                "Philippines",
                "China",
                "Colombia",
                "Philippines",
                "Honduras",
                "Indonesia",
                "Brazil",
                "China",
                "United States",
                "Russia"};
// print all numbers from prices array that are more than 100
        System.out.println("________ price less than 100_______________");
        for (double eachPrice : prices) {
            if (eachPrice > 100.0) {
                System.out.print(eachPrice + " ");
            }


        }
        System.out.println("\n____Prices between 10 and 70 inclusive_____");
        for (double price : prices){
            if (price >=10 && price <= 70){
                System.out.print(price + " ");
            }
        }
        System.out.println("\n____ count of the prices that are more than 50_______");
        // count = 7
        int count= 0;
        for (double eachPrice : prices){
            if (eachPrice > 50){
                System.out.print(eachPrice + " ");
                count++;
            }
        }
        System.out.println("count = " + count);
        System.out.println("\n____countries with name length more than 7  - inclusive ____");
        for (String eachCountry : countries) {
            if (eachCountry.length()>=7){
                count++;
                System.out.println("countries ===>> " + eachCountry + "  " + eachCountry.length());
            }
        }
    }
}