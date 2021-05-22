package day32_Arrays_split;
import java.lang.reflect.Array;
import java.util.*;
public class MaxMinPrice {
    public static void main(String[] args) {
           //                  0          1         2         3         4               5
        String[] items  = {"Shoes", "Jacket",  "Gloves", "Airpods", "iPad", "iphone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

        // print array values as String, in same line, with no loop
        System.out.println(Arrays.toString(items));
        System.out.println(Arrays.toString(prices));
        System.out.println(Arrays.toString(itemIDs));
        System.out.println("_______________________________________________________________________");

        /*
        1) fine adn print details fo most expensive item

        2) find and print details of least expensive item
        PSEUDOCODE:
        Declare
        double MaxPrice = price of first item
        int indexOfMaxPrice = index of first item -0

        LOOP STARTS FOR prices Array:
        if price [i} from array
        if price [i] is more than maxPrice
        change maxPrice to price [i]
        set indexOfMaxPrice to i

        END FOR LOOP
        PRINT itesm [indexOf MaxPrice] + prices [indexOfMaxPrice] + itemIDs [indexOfMaxPrice]
         */
   double maxPrice = prices[0];// assume First Price is max
   int indexOfMaxPrice =0;// assume max price is at index 0

   for (int i=0; i<prices.length; i++){
       if (prices[i]> maxPrice){
           maxPrice = prices[i];
           indexOfMaxPrice = i;

       }
   }

        System.out.println("MaxPrice  " + maxPrice );
   int indexOfMinPrice =0;

    for (int i=0; i < prices.length; i++){

    }
        System.out.println("indexOfMaxPrice = " + indexOfMaxPrice);
        System.out.println(items[indexOfMaxPrice] + " - $" + prices[indexOfMaxPrice] +" - #" +itemIDs[indexOfMaxPrice]);
        //todo debug to understand the story

        System.out.println("----FIND AND PRINT THE LESS EXPENSIVE PRICE --------");

        double lessExpensive = prices[0];
        int indexOfLessExpensive = 0;
        for(int i = 0; i < items.length; i++){
            if(prices[i] < lessExpensive){
                lessExpensive = prices[i];
                indexOfLessExpensive= i;
            }
        }
        System.out.println("the less expensive price is: " + lessExpensive);
        System.out.println("Index of less expensive price " + indexOfLessExpensive);
        System.out.println(items[indexOfLessExpensive] + " - $" + prices[indexOfLessExpensive] + " - #" +itemIDs[indexOfLessExpensive]);
    }
}


